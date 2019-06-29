/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.avenger;

/**
 *
 * @author HERFY HIDAYAT
 */
public class uas_a21700144_avenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hulk bp = new hulk(); //bp adalah variabel yang diwakilkan dari class 
        bp.setnamaAvenger("-- Hulk --");//memasukan nama
        bp.setKarakter5("Nama asli Hulk adalah Dr. Robert Bruce Banner. Hulk muncul setelah Banner secara" +
        "\n                   tidak sengaja terkena test ledakan dari bom gamma yang ia temukan. Sesudah " +
        "\n                   kejadian itu, Banner akan berubah menjadi Hulk, digambarkan sebagai seorang" +
        "\n                   raksasa, monster humanoid, mengarahkan kehidupan Banner menjadi sangat rumit.\n");//memasukan karaktern
        System.out.println("Nama Avenger     : "+bp.getnamaAvenger());//memanggil nama 
        System.out.println("Karakter Avenger : "+bp.getKarakter5());//memanggil karakter
        
        //captamerica
        capt_america cp= new capt_america();
        cp.setnamaAvenger("-- Captain America --");
        cp.setKarakter1("Nama asli Captain America adalah Steven Steve Rogers. Captain America tidak" +
        "\n                   memiliki kekuatan super, tetapi dalam tubuhnya terdapat Serum Super-Soldier serta " +
        "\n                   Vita-Ray, yang mampu membuatnya memiliki kekuatan, ketahanan, kelincahan," +
        "\n                   kecepatan, refleks, daya tahan, dan penyembuhan yang berbeda dengan manusia" +
        "\n                   lainnya. Captain America sering menggunakan perisainya sebagai senjata lempar ofensif.\n");
        System.out.println("Nama Avenger     : "+cp.getnamaAvenger());
        System.out.println("Karakter Avenger : "+cp.getKarakter1());
    
    
        //drstrangekarakter4
        loki d= new loki();
        d.setnamaAvenger("-- Loki --");// memasukan nama 
        d.setKarakter4("Nama aslinya adalah Loki Laufeyson. Loki memiliki julukan sebagai God of Lies and " +
        "\n                   Mischief dan God of Evil. Loki adalah Saudara angkat dari Thor. Loki memiliki" +
        "\n                   kemampuan ekstrasensori dan mampu melakukan proyeksi astral. Meskipun memiliki" +
        "\n                   kecerdasan yang luar biasa, namun Loki tidak bisa membaca pikiran makhluk lain.\n");//memasukan karakter 
        System.out.println("Nama Avenger     : "+d.getnamaAvenger());//menampilkan nama 
        System.out.println("Karakter Avenger : "+d.getKarakter4());//menampilkan karakter 
    
        //ironman
        iron_man im = new iron_man();
        im.setnamaAvenger("-- Iron Man --");
        im.setKarakter("Nama asli Iron Man adalah Anthony Edward Tony Stark. Tony Stark adalah seorang" +
        "\n                   jenius inventif yang memiliki keahlian di bidang matematika, fisika, kimia, dan" +
        "\n                   saingan ilmu komputer dari Reed Richards, Hank Pym, dan Bruce Banner, dan" +
        "\n                   keahliannya dalam teknik elektro dan teknik mesin bahkan melampaui kemampuan" +
        "\n                   mereka. Dia dianggap sebagai salah satu karakter paling cerdas di Marvel Universe.\n");
        System.out.println("Nama Avenger     : "+im.getnamaAvenger());
        System.out.println("Karakter Avenger : "+im.getKarakter());
        
        //spiderman3
        nebula sp = new nebula();
        sp.setnamaAvenger("-- Nebula --");
        sp.setKarakter3("Nebula adalah wanita atletis, dan pejuang bersenjata dan tidak bersenjata yang" +
        "\n                   sangat baik. Dia memiliki kecerdasan yang berbakat dan ahli strategi pertempuran" +
        "\n                   yang brilian. Nebula diubah oleh Dokter Mandibus menjadi cyborg. Dia diberi mata" +
        "\n                   kiri tiruan, lengan kiri, dan bahu kiri. Bagian kiri atas kepalanya dan bagian" +
        "\n                   pinggul kanannya dilapisi logam.\n");
        System.out.println("Nama Avenger     : "+sp.getnamaAvenger());
        System.out.println("Karakter Avenger : "+sp.getKarakter3());
        
        //thor 
        thor th = new thor();
        th.setnamaAvenger("-- Thor --");
        th.setKarakter2("Memiliki nama Thor Odinson. Thor adalah dewa petir dan memegang sebuah palu" +
        "\n                   bernama Mjolnir, yang memberikannya kemampuan terbang, mengendalikan cuaca, juga" +
        "\n                   perjalanan dimensi. Thor memiliki saudara, yaitu Loki dan Hela. Thor adalah anak" +
        "\n                   dari Raja Odin.\n");
        System.out.println("Nama Avanger     : "+th.getnamaAvenger());
        System.out.println("Karakter Avanger : "+th.getKarakter2());
        
        //winter soldier
        vision ws =new vision();
        ws.setnamaAvenger("-- Vision --");
        ws.setKarakter5("Memiliki nama Victor Shade. Vision merupakan sosok android ciptaan Ultron yang" +
        "\n                   ditugaskan untuk membawa tim Avengers ke dalam perangkap. Akan tetapi, Avengers" +
        "\n                   berhasil membuatnya berbalik melawan Ultron. Kekuatannya adalah mengeluarkan sinar" +
        "\n                   infra merah dan radiasi gelombang mikro. Kemampuan lainnya bisa melayang di udara," +
        "\n                   menyerap energi matahari, hingga menembus dinding layaknya hantu.\n");
        System.out.println("Nama Avenger     : "+ws.getnamaAvenger());
        System.out.println("Karakter Avenger : "+ws.getKarakter6());
        
    
}
}
