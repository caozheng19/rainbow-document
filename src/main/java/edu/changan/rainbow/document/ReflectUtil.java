package edu.changan.rainbow.document;

import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.style.Style;
import com.itextpdf.text.Phrase;
import edu.changan.rainbow.document.entity.PdfInfo;
import edu.changan.rainbow.document.entity.info.CooperationUnitInfo;
import edu.changan.rainbow.document.entity.info.PhaseInfo;
import edu.changan.rainbow.document.entity.info.ResearcherInfo;
import springfox.documentation.spring.web.json.Json;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
反射获取私有变量属性值
 */
public class ReflectUtil {

    public static String getFieldValueByFieldName(String fieldName, Object object) {

        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            //设置对象的访问权限，保证对private的属性的访问
            field.setAccessible(true);
            return (String) field.get(object);
        } catch (Exception e) {

            return null;
        }
    }

    public static void data2Template(Field[] fields, Map<String, Object> model, Object object, PdfInfo pdfInfo) throws IllegalAccessException {
        for (Field field : fields) {
            //设置允许通过反射访问私有变量
            field.setAccessible(true);
            //获取字段的值
            String value = field.get(object).toString();
            //获取字段属性名称
            String name = field.getName();
            //其他自定义操作
            if (name.equals("cooperationUnitInfoList")) {
                List<CooperationUnitInfo> cooperationUnitInfoList = pdfInfo.getBaseInfo().getCooperationUnitInfoList();
                model.put("unitLists", cooperationUnitInfoList);
            } else if (name.equals("researcherInfoList")) {
                List<ResearcherInfo> researcherInfoList = pdfInfo.getProParticipantsInfo().getResearcherInfoList();
                model.put("mainResearcherList", researcherInfoList);
            } else if (name.equals("phaseInfoList")) {
                List<PhaseInfo> phaseInfoList = pdfInfo.getProjectScheduleInfo().getPhaseInfoList();
                model.put("projectScheduleList",phaseInfoList);
            } else if (name.equals("projectType")) {
                String val = ReflectUtil.getFieldValueByFieldName(name, object);
                if (val.equals("1")) {
                    model.put("projectTypeL","☑");
                    model.put("projectTypeR","☐");
                } else if(val.equals("2")) {
                    model.put("projectTypeL","☐");
                    model.put("projectTypeR","☑");
                }

            }
            model.put(name, ReflectUtil.getFieldValueByFieldName(name, object));
        }
    }
}
