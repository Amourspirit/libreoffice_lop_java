package io.github.amourspirt.office_test;
// ExamineDoc.java
// Andrew Davison, ad@fivedots.coe.psu.ac.th, March 2015

/* Examine a document using the MRI UNO object browser

   Info on MRI:
     Available from http://extensions.services.openoffice.org/en/project/MRI
     Docs: https://github.com/hanya/MRI/wiki
     Forum tutorial: https://forum.openoffice.org/en/forum/viewtopic.php?f=74&t=49294

   Usage:
     compile ExamineDoc.java

     run ExamineDoc story.doc
*/

import com.sun.star.uno.*;
import com.sun.star.lang.*;
import com.sun.star.frame.*;

import com.sun.star.text.*;

import io.github.amourspirt.utils.Lo;
import io.github.amourspirt.utils.GUI;

// Following line is windows only
// import io.github.amourspirt.utils.JNAUtils;


public class ExamineDoc
{

  public static void main(String[] args)
  {
    if (args.length != 1) {
      System.out.println("Usage: ExamineDoc fnm");
      return;
    }

    XComponentLoader loader = Lo.loadOffice();

    // open the document so its services can be retrieved
    XComponent doc = Lo.openDoc(args[0], loader);
    if (doc == null) {
      System.out.println("Could not open " + args[0]);
      Lo.closeOffice();
      return;
    }

    GUI.setVisible(doc, true);   // needed so that close of MRI doesn't 
                                 // cause UNO bridge to be disposed

    Lo.mriInspect(doc);          // use MRI inspect()

    // windows only
    // JNAUtils.winWait("MRI");     // stop Java until inspect window is closed

    System.out.println("Reached here");

    Lo.closeDoc(doc);
    Lo.closeOffice();
  } // end of main()


}  // end of ExamineDoc class

