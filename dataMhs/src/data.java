
import java.awt.*;
import javax.swing.*;

public class data extends JFrame{
    JButton ok;
    JLabel nama, nim, jk, agama, alamat, judul;
    JTextField name, nomor ;
    JRadioButton L, P;
    ButtonGroup group;
    JTextArea almt;
    JComboBox religion;
    String daftar[]={"Islam","Kristen","Hindu","Budha"};
    public void mhs(){
//      add object
        judul = new JLabel("DATA DIRI MAHASISWA");
        nama = new JLabel("Nama");
        name = new JTextField(" ");
        nim = new JLabel("NIM"); 
        nomor = new JTextField(" "); 
        jk = new JLabel("Jenis Kelamin");
        L = new JRadioButton("L");
        P = new JRadioButton("P");
        agama = new JLabel("Agama");
        religion = new JComboBox(daftar);
        group = new ButtonGroup();
        alamat = new JLabel("Alamat");
        almt = new JTextArea("");
        ok = new JButton("OK");
        
        setLayout(null);
        add (judul);
        add (nama);
        add (name);
        add (nim);
        add (nomor);
        add (jk);
        add (L);
        add (P);
        add (agama);
        add (religion);
        add (alamat);
        add (almt);
        add (ok);
        
        judul.setBounds(140,9,150,15);
        nama.setBounds(70,50,40,20);
        name.setBounds(175,50,150,20);
        nim.setBounds(70,75,40,20);
        nomor.setBounds(175,75,150,20);
        jk.setBounds(70,100,80,20);
        L.setBounds(175,100,40,20);
        P.setBounds(220,100,40,20);
//        add radio button in 1 group 
        group.add (L);
        group.add (P);
//        end
        agama.setBounds(70,125,40,20);
        religion.setBounds(175,125,90,20);
        alamat.setBounds(70,150,40,20);
        almt.setBounds(175,152,190,100);
        ok.setBounds(290,290,55,20);
        
        
        setSize(440,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
