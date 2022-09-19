package edu.changan.rainbow.document;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class PDFUtil {

    public static boolean merge(List<String> fileList, String outputFile) throws Exception {

        Document document = new Document();
        document.setMargins(0, 0, 0, 0);
        OutputStream fos = new FileOutputStream(outputFile);
        PdfCopy copy = new PdfCopy(document, fos);

        document.open();
        for (String file : fileList) {
            PdfReader reader = new PdfReader(file);
            copy.addDocument(reader);
            copy.freeReader(reader);
            reader.close();
        }
        document.close();

        System.out.println("PDF Merge Succefully !");

        return true;
    }


    public static boolean addWaterMark(String inputFile, String outputFile, String text) {
        float opacity = 0.3f;
        int fontsize = 60;
        int angle = 30;

        return addWaterMark(inputFile, outputFile, text, opacity, fontsize, angle);
    }

    public static boolean addWaterMark(String inputFile, String outputFile, String text, float opacity, int fontsize, int angle) {
        File file = new File(inputFile);
        if (!file.exists()) {
            return false;
        }

        PdfReader reader = null;
        PdfStamper stamper = null;
        try {
            reader = new PdfReader(inputFile);
            stamper = new PdfStamper(reader, new FileOutputStream((outputFile)));

            int totalPages = reader.getNumberOfPages();
            //System.out.println("PDF pages：" + totalPages);

            BaseFont font = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.EMBEDDED);

            PdfGState gState = new PdfGState();
            gState.setFillOpacity(opacity);
            gState.setStrokeOpacity(0.2f);

            PdfContentByte marker;
            for (int i = 1; i < totalPages + 1; i++) {
                Rectangle pageSize = reader.getPageSizeWithRotation(i);
                float width = pageSize.getWidth();
                float height = pageSize.getHeight();

                marker = stamper.getOverContent(i);
                marker.setGState(gState);
                marker.setFontAndSize(font, fontsize);
                //marker.setColorFill(BaseColor.LIGHT_GRAY);

                marker.beginText();
                marker.showTextAligned(Element.ALIGN_CENTER, text, width / 2, height / 2, angle);
                marker.endText();
            }
            System.out.println("add marker successfully !");
            return true;
        } catch (IOException e) {
            System.out.println("add marker failed !" + e);
            e.printStackTrace();
            return false;
        } catch (DocumentException e) {
            System.out.println("add marker failed !" + e);
            e.printStackTrace();
            return false;
        } finally {
            if (stamper != null) {
                try {
                    stamper.close();
                } catch (IOException e) {
                    System.out.println("stamper close failed !" + e);
                    e.printStackTrace();
                    return false;
                } catch (DocumentException e) {
                    System.out.println("stamper close failed !" + e);
                    e.printStackTrace();
                    return false;
                }
            }
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static boolean addPageNumber(String inputFile, String outputFile, int skipPages) {
        File file = new File(inputFile);
        if (!file.exists()) {
            return false;
        }

        PdfReader reader = null;
        PdfStamper stamper = null;
        try {
            reader = new PdfReader(inputFile);
            stamper = new PdfStamper(reader, new FileOutputStream((outputFile)));

            int totalPages = reader.getNumberOfPages();
            System.out.println("PDF pages：" + totalPages);

            BaseFont bfont = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.EMBEDDED);

            PdfContentByte footer;
            for (int i = 1 + skipPages; i < totalPages + 1; i++) {
                Rectangle pageSize = reader.getPageSizeWithRotation(i);
                float width = pageSize.getWidth();
                float height = pageSize.getHeight();

                footer = stamper.getOverContent(i);

                String text = String.format("%d / %d", i - skipPages, totalPages - skipPages);
                Font font = new Font(bfont, 12f, Font.NORMAL);
                Paragraph p = new Paragraph(text, font);
                ColumnText.showTextAligned(footer, Element.ALIGN_CENTER, new Phrase(p), width / 2, 52, 0);
            }
            System.out.println("add Page Number successfully !");
            return true;
        } catch (IOException e) {
            System.out.println("add Page Number failed !" + e);
            e.printStackTrace();
            return false;
        } catch (DocumentException e) {
            System.out.println("add Page Number failed !" + e);
            e.printStackTrace();
            return false;
        } finally {
            if (stamper != null) {
                try {
                    stamper.close();
                } catch (IOException e) {
                    System.out.println("stamper close failed !" + e);
                    e.printStackTrace();
                    return false;
                } catch (DocumentException e) {
                    System.out.println("stamper close failed !" + e);
                    e.printStackTrace();
                    return false;
                }
            }
            if (reader != null) {
                reader.close();
            }
        }
    }
}
