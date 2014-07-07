//=======================LicenseRemoveMojo.java=======================//
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
//=======================LicenseRemoveMojo.java=======================//
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
//=======================LicenseRemoveMojo.java=======================//
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
=======
>>>>>>> 38bdafccd2a821f2fa07d302a876f11a6922b02d




<<<<<<< HEAD
>>>>>>> 0aeb2c99239193fb2bfbb634e8ff9013cd192ae5
=======
>>>>>>> 38bdafccd2a821f2fa07d302a876f11a6922b02d
=======
>>>>>>> 2664aa9f2caa2e67462ff988a8238b62c8d3217f
package com.mycila.maven.plugin.license;
import com.mycila.maven.plugin.license.document.Document;
import com.mycila.maven.plugin.license.header.Header;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import java.io.File;

/**
 * Remove the specified header from source files
 *
 * @author Mathieu Carbou (mathieu.carbou@gmail.com)
 */
@Mojo(name = "remove", threadSafe = true)
public final class LicenseRemoveMojo extends AbstractLicenseMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Removing license headers...");

        execute(new Callback() {
            @Override
            public void onHeaderNotFound(Document document, Header header) {
                debug("Header was not found in: %s (But keep trying to find another header to remove)", document.getFile());
                remove(document);
            }

            @Override
            public void onExistingHeader(Document document, Header header) {
                info("Removing license header from: %s", document.getFile());
                remove(document);
            }
        });
    }

    private void remove(Document document) {
        document.parseHeader();
        if (document.headerDetected())
            document.removeHeader();
        if (!dryRun) {
            document.save();
        } else {
            String name = document.getFile().getName() + ".licensed";
            File copy = new File(document.getFile().getParentFile(), name);
            info("Result saved to: %s", copy);
            document.saveTo(copy);
        }
    }

}
