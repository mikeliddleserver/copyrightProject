//  Copyright:   
//  Website:     
//  Description:
//  Comments:  
//  Last edit:   
//  Author:      
//  E-mail:      asdfasdf
//
//  The copyright to the source code and computer program(s)
//  herein is the property of Connor Group.
//  The source code and program(s) may be used and/or copied
//  only with the written permission of Connor Group or in
//  accordance with the terms and conditions stipulated in
//  the agreement/contract under which the source code and
//  program(s) have been supplied. 
//  


package com.mycila.maven.plugin.license;

import com.mycila.maven.plugin.license.document.Document;

import java.util.Map;
import java.util.Properties;

/**
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 * @date 2013-08-27
 */
public interface PropertiesProvider {
    Map<String, String> getAdditionalProperties(AbstractLicenseMojo mojo, Properties currentProperties, Document document);
}
