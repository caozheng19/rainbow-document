package edu.changan.rainbow.test;

import edu.changan.rainbow.document.OfficeUtil;
import edu.changan.rainbow.document.PDFUtil;
import edu.changan.rainbow.document.entity.Major;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class DocumentApplicationTest {

    @Test
    void contextLoads() {
    }

    @Test
    void docxtemplate() throws Exception {
        // 1. DOCX模板
        String templatefilename = "src\\test\\resources\\template\\template.docx";
        String docfilename = templatefilename + ".docx";

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

        // 2. DOCX转PDF
        String pdffilename = docfilename + ".pdf";
        OfficeUtil.Doc2PDF(docfilename, pdffilename);

        // 3. 合并PDF
        List<String> pdfList = new ArrayList<String>();
        //fileList.add("target/附件2-陕西省2022年自然资源科技攻关项目申请书.pdf");
        pdfList.add(pdffilename);
        pdfList.add("src/test/resources/template/attachment.pdf");

        String mergeFile = pdffilename + "-merge.pdf";
        try {
            PDFUtil.merge(pdfList, mergeFile);
        } catch (Exception e) {
            System.out.println("add marker failed !" + e);
            e.printStackTrace();
        }

        // 4. 加水印
        String text = "水印1234567890";
        String inputFile = mergeFile;
        String markerFile = mergeFile + "-marker.pdf";
        PDFUtil.addWaterMark(inputFile, markerFile, text);

        // 5. 加页码
        inputFile = markerFile;
        String numberFile = markerFile + "-number.pdf";
        PDFUtil.addPageNumber(inputFile, numberFile, 2);
    }
}
