package javaCore.Annotation;

import java.lang.reflect.Method;

public class AnnotationAnalizator {
    public void analize(Class<?> clazz){
        Method[] methods = clazz.getMethods();

        for (Method m: methods) {
            if (m.isAnnotationPresent(XmlElement.class)){
                XmlElement xmlElement = m.getAnnotation(XmlElement.class);
                System.out.println(xmlElement.name() );

            }
            if (m.isAnnotationPresent(XMLAtribute.class)){
                XMLAtribute xmlAtribute = m.getAnnotation(XMLAtribute.class);
                System.out.println(xmlAtribute.name());
            }
            
        }

    }
}
