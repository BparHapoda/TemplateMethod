package org.example;

abstract class WebSite {
    private String header;
    private String info;
    private String footer;

    public WebSite (String header,String footer){
        this.header=header;
        this.footer=footer;
    }

     void print () {
System.out.println(header);
System.out.println(info ());
System.out.println(footer);
    }
    abstract String info();

   static class NewsSite extends WebSite {

       public NewsSite(String header,String footer){
           super(header,footer);

       }
public String info (){
    String info ="News Info";
  return   info;
}
    }

  static   class MusicSite extends WebSite{
public MusicSite (String header,String footer ){
    super(header, footer);
}
        public String info (){
        String info ="Music Info";
        return info;}
    }
}
