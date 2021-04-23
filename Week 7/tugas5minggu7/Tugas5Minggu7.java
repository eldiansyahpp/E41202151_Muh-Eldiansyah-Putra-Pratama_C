package tugas5minggu7;

public class Tugas5Minggu7 {

    public static void main(String[] args) {
        Television tv = new Television("TV Modern, 29 inches", 100);
    String[] semuaChannel = {"RCTI","SCTV","INDOSIAR","LA TV",
                             "METRO TV","TRANS TV","TPI","TV 7",
                             "TVRI","TV G","ANTV"};

    System.out.println("Pak Lukman membeli Televisi : " + tv.getDeskrips());

    tv.getChannel();
    tv.setChannel(semuaChannel);
    
    tv.setChannelAktif(3);
    tv.setVolume(10);
    tv.setChannelAktif(10);
    tv.setChannelAktif(1);
    tv.setModusTampilan(Television.TELETEXT);
    tv.setHalamanTeletext(250);
    tv.setModusTampilan(Television.TV);
    tv.PlayCD();
    tv.setDiscTray("The Matrix");
    tv.PlayCD();
    }
    
}
