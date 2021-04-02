/*
* to_FullChar Full Width Function
* String s1 = to_FullChar("A1가 ");
* byte[] full_List = s1.getBytes("EUC-KR");
* to_HalfChar Half Width Function
* String s1 = to_HalfChar(new String(binary, offset, length, "EUC-KR");
* byte[] half_List = s1.getBytes("EUC-KR");
*
* ASCII
* 0xfee0 - Full width(+), Half width(-) 
* 0x20 - space
* 0x21 - !
* 0x7e - ~
* 0xfee0 - full width Blank
*/

private String to_HalfChar(String src){
  if(src == null) return null;
  StringBuffer strBuf = new StringBuffer();
  char c = 0;
  int nSrcLength = src.length();
  for(int i = 0; i < nSrcLength; i++){
    c = src.charAt(i);
    
    //English Or Special Characters
    if(c >= '!' && c <= '~'){
        c -= 0xfee0; //Half width(-)
    }else if(c == '　'){
        c = 0x20;
    }  
    // StringBuffer Add Char
    strBuf.append(c);
  }
  return strBuf.toString();
}

private String to_FullChar(String src){
    if(src == null) return null;
    StringBuffer strBuf = new StringBuffer();
    char c = 0;
    int nSrcLength = src.length();
    for(int i = 0; i < nSrcLength; i++){
        c = src.charAt(i);
      if(c >= 0x21 && c <= 0x7e){
          c += 0xfee0; //Full width(+)
      }else if(c == 0x20){
          c = 0x3000;
      }
      strBuf.append(c);
    }
  return strBuf.toString();
}
