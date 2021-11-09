

/*
 + Code by Mochammad Yusuf Pratama ( NPM 21082010063 )( Par B082 )
 + FIK Sistem Informasi UPN "Veteran" Jawa Timur
 + 
 + Input Output Documentation : 
 + https://myassignmentyusuf.wordpress.com/2021/11/08/portofolio-mata-kuliah-bahasa-pemrograman-1-7/
*/

package kuliah;

import java.util.Scanner;

public class kuliahBP_8 {
    
    public static void main(String[] args) {
        
        // Call Scanner
        Scanner scan = new Scanner(System.in);
        
        // Inisialisasi
        boolean stop = false;
        String namaSubMenu[] = new String[7];
        int hargaSubMenu[] = new int[7];
        int porsi[] = new int[7];
        int bayar[] = new int[7];
        int totalPembelian = 0, hargaAkhir = 0, diskon = 0,
                uangPembayaran = 0, kembalian = 0;
        int counter = 0;
        
        // Judul Program
        System.out.println("=================================================================");
        System.out.println("Kasir Rumah Makan Sumber Kenyang");
        System.out.println("=================================================================");
        System.out.println("Sedia : ");
        System.out.println("1. Aneka Sate.");
        System.out.println("2. Aneka Pecel.");
        System.out.println("3. Aneka Penyetan.");
        System.out.println("=================================================================");
        
        // Loop CheckOut
        while(!stop) {
            
            System.out.print("Pilih Menu : ");
            int menu = scan.nextInt();
            System.out.println("=================================================================");
            
            switch(menu){
                case 1: // Sate
                    System.out.println("Aneka Menu Sate dan Harga : ");
                    System.out.println("1. Sate Ayam Rp20.000 per Porsi.");
                    System.out.println("2. Sate Kambing Rp40.000 per Porsi.");
                    System.out.print("Pilih Sub Menu Sate: ");
                    int sate = scan.nextInt();
                    
                    switch(sate){
                        case 1: // Sate Ayam
                            namaSubMenu[counter] = "Sate Ayam";
                            hargaSubMenu[counter] = 20000;
                            System.out.print("Masukkan Jumlah Porsi : ");
                            porsi[counter] = scan.nextInt();
                            bayar[counter] = hargaSubMenu[counter] * porsi[counter];
                            System.out.println("Total Bayar : Rp" + bayar[counter]);
                            totalPembelian = totalPembelian + bayar[counter];
                            break;
                        case 2: // Sate Kambing
                            namaSubMenu[counter] = "Sate Kambing";
                            hargaSubMenu[counter] = 40000;
                            System.out.print("Masukkan Jumlah Porsi : ");
                            porsi[counter] = scan.nextInt();
                            bayar[counter] = hargaSubMenu[counter] * porsi[counter];
                            System.out.println("Total Bayar : Rp" + bayar[counter]);
                            totalPembelian = totalPembelian + bayar[counter];
                            break;
                        default : 
                            System.out.println("Sub Menu Sate Yang Anda Pilih Tidak Tersedia!");
                            break;
                    }
                    break;
                case 2: // Pecel
                    System.out.println("Aneka Menu Pecel dan Harga : ");
                    System.out.println("1. Pecel Biasa Rp15.000 per Porsi.");
                    System.out.println("2. Pecel Ayam Rp20.000 per Porsi.");
                    System.out.print("Pilih Sub Menu Pecel : ");
                    int pecel = scan.nextInt();
                    
                    switch(pecel){
                        case 1: // Pecel Biasa
                            namaSubMenu[counter] = "Pecel Biasa";
                            hargaSubMenu[counter] = 15000;
                            System.out.print("Masukkan Jumlah Porsi : ");
                            porsi[counter] = scan.nextInt();
                            bayar[counter] = hargaSubMenu[counter] * porsi[counter];
                            System.out.println("Total Bayar : Rp" + bayar[counter]);
                            totalPembelian = totalPembelian + bayar[counter];
                            break;
                        case 2: // Pecel Ayam
                            namaSubMenu[counter] = "Pecel Ayam";
                            hargaSubMenu[counter] = 20000;
                            System.out.print("Masukkan Jumlah Porsi : ");
                            porsi[counter] = scan.nextInt();
                            bayar[counter] = hargaSubMenu[counter] * porsi[counter];
                            System.out.println("Total Bayar : Rp" + bayar[counter]);
                            totalPembelian = totalPembelian + bayar[counter];
                            break;
                        default : 
                            System.out.println("Sub Menu Pecel Yang Anda Pilih Tidak Tersedia!");
                            break;
                    }
                    break;
                case 3: // Penyetan
                    System.out.println("Aneka Menu Penyetan dan Harga : ");
                    System.out.println("1. Penyetan Biasa Rp15.000 per Porsi.");
                    System.out.println("2. Penyetan Telur Rp18.000 per Porsi.");
                    System.out.println("3. Penyetan Ayam Rp25.000 per Porsi.");
                    System.out.print("Pilih Sub Menu Penyetan : ");
                    int penyetan = scan.nextInt();
                    
                    switch(penyetan){
                        case 1: // Penyetan Biasa
                            namaSubMenu[counter] = "Penyetan Biasa";
                            hargaSubMenu[counter] = 15000;
                            System.out.print("Masukkan Jumlah Porsi : ");
                            porsi[counter] = scan.nextInt();
                            bayar[counter] = hargaSubMenu[counter] * porsi[counter];
                            System.out.println("Total Bayar : Rp" + bayar[counter]);
                            totalPembelian = totalPembelian + bayar[counter];
                            break;
                        case 2: // Penyetan Telur
                            namaSubMenu[counter] = "Penyetan Telur";
                            hargaSubMenu[counter] = 18000;
                            System.out.print("Masukkan Jumlah Porsi : ");
                            porsi[counter] = scan.nextInt();
                            bayar[counter] = hargaSubMenu[counter] * porsi[counter];
                            System.out.println("Total Bayar : Rp" + bayar[counter]);
                            totalPembelian = totalPembelian + bayar[counter];
                            break;
                        case 3: // Penyetan Ayam
                            namaSubMenu[counter] = "Penyetan Ayam";
                            hargaSubMenu[counter] = 25000;
                            System.out.print("Masukkan Jumlah Porsi : ");
                            porsi[counter] = scan.nextInt();
                            bayar[counter] = hargaSubMenu[counter] * porsi[counter];
                            System.out.println("Total Bayar : Rp" + bayar[counter]);
                            totalPembelian = totalPembelian + bayar[counter];
                            break;
                        default : 
                            System.out.println("Sub Menu Penyetan Yang Anda Pilih Tidak Tersedia!");
                            break;
                    }
                    break;
                default: 
                    System.out.println("Menu yang Anda Pilih Tidak Tersedia!");
                    break;
            }
            
            counter++;
            
            System.out.println("=================================================================");
            
            String jawab;
            boolean stopAsk = false;
            
            // Loop (Pertanyaan)
            while (!stopAsk) {
                System.out.print("Ingin Menambah Pesanan (Y/N) : ");

                jawab = scan.next();

                if (!jawab.toLowerCase().equals("y") && !jawab.toLowerCase().equals("n")) {
                    continue;
                }

                stopAsk = true;

                if (jawab.toLowerCase().equals("n")) {
                    stop = true;
                }
                                        
            }
            
            System.out.println("=================================================================");
            
        }
        
        System.out.println("");
        
        // Kartu Member
        String kartuMember;
        boolean loop = false;
        
        // Input Uang Pembayaran
        System.out.println("=================================================================");
        System.out.println("Total Pembelian : Rp" + totalPembelian);
        System.out.print("Uang Pembayaran : ");
        uangPembayaran = scan.nextInt();
                                      
        // Pengkondisian dan Looping Kartu Member
        while(!loop) {
            
            System.out.print("Memiliki Kartu Member Rumah Makan Sumber Kenyang [Y/N] ? ");
            kartuMember = scan.next();
            
            if(!kartuMember.toLowerCase().equals("y") && !kartuMember.toLowerCase().equals("n")) {
                continue;
            }
            
            System.out.println("=================================================================");
            System.out.println("");
            
            if(loop = true) {
                
                if(kartuMember.toLowerCase().equals("y")) {
                    // Memiliki Kartu Disc 10%
                    
                    diskon = (int)(totalPembelian * 0.1);
                    hargaAkhir = totalPembelian - diskon;
                    kembalian = uangPembayaran - hargaAkhir;
                    
                    // Struk Memiliki Kartu
                    System.out.println("=================================================================");
                    System.out.println("Struk Pembayaran Rumah Makan Sumber Kenyang");
                    System.out.println("=================================================================");
                    System.out.println("No.\tMenu\t\tHarga\t\tPorsi\t\tBayar");
                    System.out.println("=================================================================");
                    for( int a = 0; a <= counter-1; a++ ) {

                        System.out.println((a+1) + ".\t" + namaSubMenu[a] + "\tRp" + 
                            hargaSubMenu[a] + "\t\t" + porsi[a] + "\t\tRp" + bayar[a]);
            
                    }
                    System.out.println("=================================================================");
                    System.out.println("Total Pembelian\t\t: Rp" + totalPembelian);
                    System.out.println("Diskon Kartu Member\t: Rp" + diskon);
                    System.out.println("Harga Akhir\t\t: Rp" + hargaAkhir);
                    System.out.println("Uang Pembayaran\t\t: Rp" + uangPembayaran);
                    System.out.println("Kembalian\t\t: Rp" + kembalian);
                    System.out.println("=================================================================");
                    
                } else if(kartuMember.toLowerCase().equals("n")) {
                    // Tidak Memiliki Kartu
                    
                    kembalian = uangPembayaran - totalPembelian;
                    
                    // Struk Tidak Memiliki Kartu
                    System.out.println("=================================================================");
                    System.out.println("Struk Pembayaran Rumah Makan Sumber Kenyang");
                    System.out.println("=================================================================");
                    System.out.println("No.\tMenu\t\tHarga\t\tPorsi\t\tBayar");
                    System.out.println("=================================================================");
                    for( int a = 0; a <= counter-1; a++ ) {

                        System.out.println((a+1) + ".\t" + namaSubMenu[a] + "\tRp" + 
                            hargaSubMenu[a] + "\t\t" + porsi[a] + "\t\tRp" + bayar[a]);
            
                    }
                    System.out.println("=================================================================");
                    System.out.println("Total Pembelian\t\t: Rp" + totalPembelian);
                    System.out.println("Uang Pembayaran\t\t: Rp" + uangPembayaran);
                    System.out.println("Kembalian\t\t: Rp" + kembalian);
                    System.out.println("=================================================================");
                    
                }
                
            }
            
        }
        
        System.out.println("");
        System.out.println("=================================================================");
        System.out.println("Terima Kasih Telah Membeli!");
        System.out.println("=================================================================");
        System.out.println("");
        
    }
    
}

