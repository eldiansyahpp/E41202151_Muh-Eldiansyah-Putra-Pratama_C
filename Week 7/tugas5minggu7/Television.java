package tugas5minggu7;

public class Television extends Tugas5Minggu7{
       
    private String deskripsi; 
    String[] channel;
    int jumlahChannel;
    int volume ;
    int channelAktif;
    String ModusTampilan;
    int HalamanTeletext;
    String DiscTray;
    public static String TELETEXT = "Teletext";
    public static String TV = "Television";
 
    public Television(String name, int jumlahChannel) {
        this.deskripsi = name;
        this.jumlahChannel = jumlahChannel;
    }
    
    public int setVolume(int volume){
        this.volume = volume;
        if(volume != 0){
           System.out.println("Intensitas volume sekarang : " + volume); 
        }else{
           System.out.println("Atur Intensitas volume sekarang!"); 
        }
        return volume;
    }
    
    public String[] getChannel(){
        System.out.println("Belum ada channel yang diset!");
        return channel;       
    }
    
    public void setChannel(String[] channel) { 
        this.channel = channel;
        String[] semuaChannel = channel;
        if(semuaChannel.length > jumlahChannel){
            System.out.println("Maaf Tv ini hanya dapat menyimpan " + jumlahChannel + " channel");
        }else if(channel == semuaChannel){
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }
    
    public String getDeskrips() {
        return deskripsi;
    }

    public void setChannelAktif(int channelAktif) {
        this.channelAktif = channelAktif;
        String[] semuaChannel = channel;
        if(channelAktif != 0){
            if(channelAktif > semuaChannel.length){
                System.out.println("Channel yang anda inginkan belum diset");
            } else {
                System.out.println("Pindah channel ke : " + semuaChannel[channelAktif]);
            }    
        }
    }

    public void setModusTampilan(String ModusTampilan) {
        this.ModusTampilan = ModusTampilan;
        if(ModusTampilan == TELETEXT){
         System.out.println("Modus tampilan : " + TELETEXT);   
        }else if(ModusTampilan == TV){
         System.out.println("Modus tampilan : " + TV);   
        }
    }

    public int setHalamanTeletext(int HalamanTeletext) {
        this.HalamanTeletext = HalamanTeletext;
        if(HalamanTeletext != 0){
         System.out.println("Berpindah ke halaman teletext " + HalamanTeletext);  
        }else{
         System.out.println("Atur halaman teletext!");   
        }
        return HalamanTeletext;
    }
    
    public void PlayCD() {
        if(DiscTray == null){
           System.out.println("Tidak ada CD di dalam dics tray"); 
        } else {
           System.out.println("Memutar Film " + DiscTray); 
        }
    }

    public void setDiscTray(String DiscTray) {
        this.DiscTray = DiscTray;
    }
    
    
}
