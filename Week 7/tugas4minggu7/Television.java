package tugas4minggu7;

public class Television extends Tugas4Minggu7{
   
    private String deskripsi; 
    String[] channel;
    int jumlahChannel;
    int volume ;
    int channelAktif;
 
    public Television(String name, int jumlahChannel) {
        this.deskripsi = name;
        this.jumlahChannel = jumlahChannel;
    }
    public int getVolume(){ 
        return volume;        
    }
    public int setVolume(int volume){
        this.volume = volume;
        System.out.println("Intensitas volume sekarang : " + volume);
        return volume;
    }
    public String[] getChannel(){
        System.out.println("Belum ada channel yang diset!");
        return channel;       
    }
    public void setChannel(String[] channel) { 
        this.channel = channel;
        String[] channelFavorit = channel;
        String[] semuaChannel = channel;
        if(semuaChannel.length > jumlahChannel){
            System.out.println("Maaf Tv ini hanya dapat menyimpan " + jumlahChannel + " channel");
        }else if(channel == channelFavorit){
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }
    public String getDeskrips() {
        return deskripsi;
    }

    public int getChannelAktif() {
        return channelAktif;
    }

    public void setChannelAktif(int channelAktif) {
        this.channelAktif = channelAktif;
        String[] semuaChannel = channel;
        String[] channelFavorit = channel;
        if(channelAktif != 0){
            if(channelAktif > channelFavorit.length && channelAktif > semuaChannel.length){
                System.out.println("Channel yang anda inginkan belum diset");
            } else {
                System.out.println("Pindah channel ke : " + channelFavorit[channelAktif]);
            }    
        }
    }
}
