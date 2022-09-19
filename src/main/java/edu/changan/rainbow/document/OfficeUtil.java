package edu.changan.rainbow.document;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.config.ConfigureBuilder;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;
import org.jodconverter.core.document.DefaultDocumentFormatRegistry;
import org.jodconverter.core.office.OfficeException;
import org.jodconverter.local.JodConverter;
import org.jodconverter.local.office.LocalOfficeManager;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * @date 2022/07/30 15:00
 * @author: SuperCheng
 * @title:
 * @description:
 */
public class OfficeUtil {
    @Value("${libreOffice.officeHome}")
    static String officeHome  ;

    public static boolean DocxTemplate(String templatefilename, String docxfilename, Map<String, Object> model) throws IOException {
        LoopRowTableRenderPolicy loopTableRenderPolicy = new LoopRowTableRenderPolicy();

        ConfigureBuilder builder = Configure.builder();
        for (String key : model.keySet()) {
            System.out.println(key + ": " + model.get(key));
            Object object = model.get(key);
            //System.out.println(object.getClass().toGenericString());
            if (object instanceof List) {
                System.out.println(object + " is " + object.getClass().toString());
                builder.bind(key, loopTableRenderPolicy);
            }
        }

        XWPFTemplate template = XWPFTemplate.compile(templatefilename, builder.build()).render(model);

        // 输出 docx
        template.writeToFile(docxfilename);

        return true;
    }

    public static boolean Doc2PDF(String docfilename, String pdffilename) throws FileNotFoundException, OfficeException {

        FileInputStream docfile = new FileInputStream(new File(docfilename));

        FileOutputStream pdffile = new FileOutputStream(pdffilename);

        LocalOfficeManager officeManager = LocalOfficeManager.builder().officeHome(officeHome).install().build();

        officeManager.start();
        JodConverter.convert(docfile).as(DefaultDocumentFormatRegistry.DOCX).to(pdffile).as(DefaultDocumentFormatRegistry.PDF).execute();
        officeManager.stop();

        return true;
    }
}
