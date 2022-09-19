package edu.changan.rainbow.document;
/*
import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.config.Configure;
import com.deepoove.poi.data.Pictures;
import com.deepoove.poi.plugin.table.LoopRowTableRenderPolicy;


import com.microsoft.schemas.vml.CTShape;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFHeader;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.xmlbeans.XmlObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@DisplayName("Example for HackLoop Table")
public class DocxtTest {

    String resource = "src/test/resources/template/render_hackloop_header.docx";
    //String resource = "src/test/resources/template/render_hackloop.docx";
    PaymentHackData data = new PaymentHackData();

    @BeforeEach
    public void init() {
        List<Goods> goods = new ArrayList<>();
        Goods good = new Goods();
        good.setCount(4);
        good.setName("墙纸");
        good.setDesc("书房卧室");
        good.setDiscount(1500);
        good.setPrice(400);
        good.setTax(new Random().nextInt(10) + 20);
        good.setTotalPrice(1600);
        good.setPicture(Pictures.ofLocal("src/test/resources/earth.png").size(24, 24).create());
        goods.add(good);
        goods.add(good);
        goods.add(good);
        data.setGoods(goods);

        List<Labor> labors = new ArrayList<>();
        Labor labor = new Labor();
        labor.setCategory("油漆工");
        labor.setPeople(2);
        labor.setPrice(400);
        labor.setTotalPrice(1600);
        labors.add(labor);
        labors.add(labor);
        labors.add(labor);
        data.setLabors(labors);

        data.setTotal("1024");

        // same line
        data.setGoods2(goods);
        data.setLabors2(labors);

    }

    @Test
    public void testPaymentHackExample() throws Exception {
        LoopRowTableRenderPolicy hackLoopTableRenderPolicy = new LoopRowTableRenderPolicy();
        LoopRowTableRenderPolicy hackLoopSameLineTableRenderPolicy = new LoopRowTableRenderPolicy(true);
        Configure config = Configure.builder().bind("goods", hackLoopTableRenderPolicy)
                .bind("labors", hackLoopTableRenderPolicy).bind("goods2", hackLoopSameLineTableRenderPolicy)
                .bind("labors2", hackLoopSameLineTableRenderPolicy).build();
        XWPFTemplate template = XWPFTemplate.compile(resource, config).render(data);

        // 生成水印
        //addWaterMarker(template.getXWPFDocument(), "20220805112233");

        // 输出 docx
        template.writeToFile("target/out_render_looprow.docx");
    }

    public static void createWaterMarker(XWPFDocument doc, String marker) {
        //5.添加水印
        // the body content
        XWPFParagraph paragraph = doc.createParagraph();  //创建文本段落
        XWPFHeaderFooterPolicy headerFooterPolicy = doc.getHeaderFooterPolicy();  //获取页面页脚
        if (headerFooterPolicy == null){
            headerFooterPolicy = doc.createHeaderFooterPolicy();  //如果没有页眉页脚则创建
        }
        // create default Watermark - fill color black and not rotated
        headerFooterPolicy.createWatermark(marker);  //设置水印显示的内容

        // get the default header
        // Note: createWatermark also sets FIRST and EVEN headers
        // but this code does not updating those other headers
         //XWPFHeader header = headerFooterPolicy.getHeader(XWPFHeaderFooterPolicy.EVEN);//FIRST);//DEFAULT);

        List<XWPFHeader> headerList = doc.getHeaderList();
        for(XWPFHeader header: headerList) {

            paragraph = header.getParagraphArray(0);
            System.out.println(header.getText());
            // get com.microsoft.schemas.vml.CTShape where fill color and rotation is set
            XmlObject[] xmlobjects = paragraph.getCTP().getRArray(0).getPictArray(0).selectChildren(
                    new QName("urn:schemas-microsoft-com:vml", "shape"));
            if (xmlobjects.length > 0) {
                CTShape ctshape = (CTShape) xmlobjects[0];
                // set fill color
                ctshape.setFillcolor("#f6f6f6");//设置水印的颜色
                // set rotation
                ctshape.setStyle(ctshape.getStyle() + ";rotation:315");//设置水印的样式  获取默认样式和旋315度
                //ctshape.setStyle(getWaterMarkStyle(ctshape.getStyle(),100)  + ";rotation:315");//设置自定义水印的样式，setStyle()方法中需传入样式字符串
            }
        }
    }



    public static void addWaterMarker(XWPFDocument doc, String marker) {
        //5.添加水印
        // the body content
        // XWPFParagraph paragraph0 = doc.createParagraph();  //创建文本段落
        XWPFHeaderFooterPolicy headerFooterPolicy = doc.getHeaderFooterPolicy();  //获取页面页脚
        if (headerFooterPolicy == null){
            headerFooterPolicy = doc.createHeaderFooterPolicy();  //如果没有页眉页脚则创建
        }
        // create default Watermark - fill color black and not rotated
        headerFooterPolicy.createWatermark(marker);  //设置水印显示的内容

        // get the default header
        // Note: createWatermark also sets FIRST and EVEN headers
        // but this code does not updating those other headers
        //XWPFHeader header = headerFooterPolicy.getHeader(XWPFHeaderFooterPolicy.EVEN);//FIRST);//DEFAULT);

        List<XWPFHeader> headerList = new ArrayList<>(doc.getHeaderList());
        if(headerList.isEmpty()) {
            headerList.add(doc.createHeader((HeaderFooterType.DEFAULT)));
        }

        // iterate all headers
        for(XWPFHeader header: headerList) {
            int size = header.getParagraphs().size();
            if(size == 0){
                header.createParagraph();
            }

            XWPFParagraph paragraph = header.getParagraphArray(0);
            System.out.println(header.getText());
            // get com.microsoft.schemas.vml.CTShape where fill color and rotation is set
            XmlObject[] xmlobjects = paragraph.getCTP().getRArray(0).getPictArray(0).selectChildren(
                    new QName("urn:schemas-microsoft-com:vml", "shape"));
            if (xmlobjects.length > 0) {
                CTShape ctshape = (CTShape) xmlobjects[0];
                // set fill color
                ctshape.setFillcolor("#f6f6f6");//设置水印的颜色
                // set rotation
                ctshape.setStyle(ctshape.getStyle() + ";rotation:315");//设置水印的样式  获取默认样式和旋315度
                //ctshape.setStyle(getWaterMarkStyle(ctshape.getStyle(),100)  + ";rotation:315");//设置自定义水印的样式，setStyle()方法中需传入样式字符串
            }
        }
    }
}
*/