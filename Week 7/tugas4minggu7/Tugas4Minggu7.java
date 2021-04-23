package tugas4minggu7;


public class Tugas4Minggu7 {

    public static void main(String[] args) {
    Television tv = new Television("TV Tempoe Doeloe, 14 inches", 10);
    String[] semuaChannel = {"RCTI","SCTV","INDOSIAR","LA TV",
                             "METRO TV","TRANS TV","TPI","TV 7",
                             "TVRI","TV G","ANTV"};
    String[] channelFavorit = {"RCTI","SCTV","INDOSIAR","LA TV",
                                "METRO TV","TRANS TV","TPI","TV 7"};

    System.out.println("Pak Lukman membeli Televisi : " + tv.getDeskrips());

    tv.getChannel();
    tv.setChannel(semuaChannel);
    tv.setChannel(channelFavorit);
    
    tv.setChannelAktif(3);
    tv.setVolume(10);
    tv.setChannelAktif(10);
    tv.setChannelAktif(1);
    
    

    }
    
}
