package com.company.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by huang on 2023/3/15.
 */
public class XMLUtil {
    //该方法用于从XML配置文件中提取具体类类名，并返回一个实例对象
    public static Object getBean() throws Exception {

        //创建DOM文档对象
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document;
        document = documentBuilder.parse(new File("config.xml"));

        //获取包含类名的文本结点
        NodeList nodeList = document.getElementsByTagName("databaseType");
        Node databaseTypeNode = nodeList.item(0).getFirstChild();
        String databaseType = databaseTypeNode.getNodeValue().trim();

        //通过类名生成实例对象并将其返回
        Class<?> clazz  = Class.forName("com.company.factory."+databaseType+"Factory");
//        Class<?> clazz  = Class.forName("com.company.plugin."+databaseType+"F");
        return clazz.newInstance();
    }
}
