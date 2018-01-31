package org.GhostAutonomousFTC;

import android.content.Context;
import android.content.Intent;


public class CodeSharer {
  public Intent share(String text) {
    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
    sharingIntent.setType("text/plain");

    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "code_generated_");
    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, codeForString(text));

    return sharingIntent;
  }

  private String codeForString(String str) {
    String newString="\"";
    int charsInLine=0;
    for(int i=0;i<str.length();i++)
    {

      newString+=str.charAt(i);
      charsInLine+=1;
      if(charsInLine>=80)
      {
        newString+="\"+\n\"";
        charsInLine=0;
      }
    }
    return newString+"\"";
  }
}