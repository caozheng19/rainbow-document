package edu.changan.rainbow.document.controller;

import edu.changan.rainbow.document.OfficeUtil;
import edu.changan.rainbow.document.PDFUtil;
import edu.changan.rainbow.document.ReflectUtil;
import edu.changan.rainbow.document.entity.Major;
import edu.changan.rainbow.document.entity.PdfInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PDFTestController {

    @RequestMapping(value = {"/exportPDF"})
    public void exportPdf(@RequestBody PdfInfo pdfInfo, HttpServletResponse response) throws Exception {

        // 1. DOCX模板
        String templatefilename = "src\\test\\resources\\template\\template.docx";
        String docfilename = templatefilename + ".docx";
        Map<String, Object> model = new HashMap<>();
        //封面信息填充
        Field[] fields1 = pdfInfo.getCovertitleInfo().getClass().getDeclaredFields();
        ReflectUtil.data2Template(fields1,model,pdfInfo.getCovertitleInfo(),pdfInfo);
        //基本信息页填充
        Field[] fields2 = pdfInfo.getBaseInfo().getClass().getDeclaredFields();
        ReflectUtil.data2Template(fields2,model,pdfInfo.getBaseInfo(),pdfInfo);
        //项目基本情况填充
        Field[] fields3 = pdfInfo.getProjectBaseInfo().getClass().getDeclaredFields();
        ReflectUtil.data2Template(fields3,model,pdfInfo.getProjectBaseInfo(),pdfInfo);
        //项目组主要参与者填充
        Field[] fields4 = pdfInfo.getProParticipantsInfo().getClass().getDeclaredFields();
        ReflectUtil.data2Template(fields4,model,pdfInfo.getProParticipantsInfo(),pdfInfo);
        //项目经费情况填充
        Field[] fields5 = pdfInfo.getProCapitalSourceInfo().getClass().getDeclaredFields();
        ReflectUtil.data2Template(fields5,model,pdfInfo.getProCapitalSourceInfo(),pdfInfo);
        //项目进度计划填充
        Field[] fields6 = pdfInfo.getProjectScheduleInfo().getClass().getDeclaredFields();
        ReflectUtil.data2Template(fields6,model,pdfInfo.getProjectScheduleInfo(),pdfInfo);
        //项目绩效目标填充
        Field[] fields7 = pdfInfo.getProPerformanceTarInfo().getClass().getDeclaredFields();
        ReflectUtil.data2Template(fields7,model,pdfInfo.getProPerformanceTarInfo(),pdfInfo);
        //审核意见
//        Field[] fields8 = pdfInfo.getAuditOpinionInfo().getClass().getDeclaredFields();
//        ReflectUtil.data2Template(fields8,model,pdfInfo.getAuditOpinionInfo(),pdfInfo);
        OfficeUtil.DocxTemplate(templatefilename, docfilename, model);

        // 2. DOCX转PDF
        String pdffilename = docfilename + ".pdf";
        OfficeUtil.Doc2PDF(docfilename, pdffilename);

        // 3. 合并PDF
        List<String> pdfList = new ArrayList<String>();
        //fileList.add("target/附件2-陕西省2022年自然资源科技攻关项目申请书.pdf");
        pdfList.add(pdffilename);
        pdfList.add("src/test/resources/template/attachment.pdf");

        String mergeFile = pdffilename + "-merge.pdf";
        PDFUtil.merge(pdfList, mergeFile);

        // 4. 加水印
        String text = "水印1234567890";
        String inputFile = mergeFile;
        String markerFile = mergeFile + "-marker.pdf";
        PDFUtil.addWaterMark(inputFile, markerFile, text);

        // 5. 加页码
        inputFile = markerFile;
        String numberFile = markerFile + "-number.pdf";
        PDFUtil.addPageNumber(inputFile, numberFile, 2);

        // 6. 输出到 HttpServletResponse


        // 7. 清理临时文件

    }
}

