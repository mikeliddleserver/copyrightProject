//=========================HeaderSection.java=========================//
//  Author:    Connor Group Software Development team 2014            //
//  Copyright: Copyright (C) 2014 Connor Group. All rights reserved.  //
//  Email:     it@connorgp.com                                        //
//  Website:   http://www.connorgp.com                                //
//                                                                    //
//  The copyright to the source code and computer program(s)          //
//  herein is the property of Connor Group.The source code            //
//  and program(s) may be used and/or copied only with the            //
//  written permission of Connor Group or in accordance with          //
//  the terms and conditions stipulated in the                        //
//  agreement/contract under which the source code and                //
//  program(s) have been supplied.                                    //
//                                                                    //
<<<<<<< HEAD
<<<<<<< HEAD
//=========================HeaderSection.java=========================//
//  Author:    Connor Group Software Development team 2014            //
//  Copyright: Copyright (C) 2014 Connor Group. All rights reserved.  //
//  Email:     it@connorgp.com                                        //
//  Website:   http://www.connorgp.com                                //
//                                                                    //
//  The copyright to the source code and computer program(s)          //
//  herein is the property of Connor Group.The source code            //
//  and program(s) may be used and/or copied only with the            //
//  written permission of Connor Group or in accordance with          //
//  the terms and conditions stipulated in the                        //
//  agreement/contract under which the source code and                //
//  program(s) have been supplied.                                    //
//                                                                    //
<<<<<<< HEAD
//=========================HeaderSection.java=========================//
//  Author:    Connor Group Software Development team 2014            //
//  Copyright: Copyright (C) 2014 Connor Group. All rights reserved.  //
//  Email:     it@connorgp.com                                        //
//  Website:   http://www.connorgp.com                                //
//                                                                    //
//  The copyright to the source code and computer program(s)          //
//  herein is the property of Connor Group.The source code            //
//  and program(s) may be used and/or copied only with the            //
//  written permission of Connor Group or in accordance with          //
//  the terms and conditions stipulated in the                        //
//  agreement/contract under which the source code and                //
//  program(s) have been supplied.                                    //
//                                                                    //
=======
>>>>>>> 0aeb2c99239193fb2bfbb634e8ff9013cd192ae5
=======
>>>>>>> 38bdafccd2a821f2fa07d302a876f11a6922b02d
=======
>>>>>>> 2664aa9f2caa2e67462ff988a8238b62c8d3217f
package com.mycila.maven.plugin.license;
import org.apache.maven.plugins.annotations.Parameter;
public class HeaderSection {
    @Parameter
    String key;

    @Parameter
    String defaultValue;

    @Parameter
    String ensureMatch;

    @Parameter
    boolean multiLineMatch = false;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getEnsureMatch() {
        return ensureMatch;
    }

    public void setEnsureMatch(String ensureMatch) {
        this.ensureMatch = ensureMatch;
    }

    public boolean isMultiLineMatch() {
        return multiLineMatch;
    }

    public void setMultiLineMatch(boolean multiLineMatch) {
        this.multiLineMatch = multiLineMatch;
    }
}
