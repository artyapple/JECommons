package org.jevis.commons.driver.inputHandler;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.InputStream;
import java.util.List;
import javax.xml.soap.SOAPMessage;

/**
 *
 * @author Broder
 */
public class InputHandlerFactory {

    public static InputHandler getInputConverter(Object input) {
        if (input instanceof List) {
            List tmp = (List) input;
            if (tmp.isEmpty()) {
                return null;
            }
            Object o = tmp.get(0);
            if (o instanceof String) {
                return new StringInputHandler((List<String>) input);
            }

            if (o instanceof List) {
                return new StringInputHandler((List<String>) o);
            }

            if (o instanceof SOAPMessage) {
                return new SOAPMessageInputHandler((List<SOAPMessage>) input);
            }
            return null;
        } else if (input instanceof Object[]) {
            return new ArrayInputHandler((Object[]) input);
        } else if (input instanceof File) {
            return new FileInputHandler((File) input);
        } else if (input instanceof InputStream) {
            return new InputStreamHandler((InputStream) input);
        }
        return null;


    }
}
