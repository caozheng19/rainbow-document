package edu.changan.rainbow.test;

import com.itextpdf.text.DocumentException;
import edu.changan.rainbow.document.PDFUtil;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PDFUtilTest {

    @Test
    public void test() throws FileNotFoundException, DocumentException {
        String inputFile = "src/test/resources/template/template.pdf";

        List<String> fileList = new ArrayList<String>();
        fileList.add(inputFile);
        fileList.add("src/test/resources/template/attachment.pdf");

        String mergeFile = inputFile + "-merge.pdf";
        try {
            PDFUtil.merge(fileList, mergeFile);
        } catch (Exception e) {
            System.out.println("add marker failed !" + e);
            e.printStackTrace();
        }

        String text = "水印1234567890";
        inputFile = mergeFile;
        String markerFile = mergeFile + "-marker.pdf";
        PDFUtil.addWaterMark(inputFile, markerFile, text);

        inputFile = markerFile;
        String numberFile = markerFile + "-number.pdf";
        PDFUtil.addPageNumber(inputFile, numberFile, 2);
    }
}
