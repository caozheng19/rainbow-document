package edu.changan.rainbow.test;

import edu.changan.rainbow.document.OfficeUtil;
import edu.changan.rainbow.document.entity.Major;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfficeUtilTest {

    @Test
    public void DocxTemplate() throws Exception {

        String templatefilename = "src\\test\\resources\\template\\template.docx";
        String docfilename = templatefilename + ".docx";
        String pdffilename = docfilename + ".pdf";

        Map<String, Object> model = new HashMap<>();
        model.put("name", "科技管理员");
        model.put("age", 28);

        List<Major> majorList = new ArrayList<>();
        Major major1 = new Major();
        major1.setMajor("计算机科学与技术");
        major1.setNumber("01");
        majorList.add(major1);

        Major major2 = new Major();
        major2.setMajor("交通信息工程");
        major2.setNumber("02");
        majorList.add(major2);

        Major major3 = new Major();
        major3.setMajor("软件工程");
        major3.setNumber("03");
        majorList.add(major3);

        model.put("majorList", majorList);

        OfficeUtil.DocxTemplate(templatefilename, docfilename, model);

        OfficeUtil.Doc2PDF(docfilename, pdffilename);
    }
}
