/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.posttest1;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Posttest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         ArrayList<Komik> comics = new ArrayList<>();


        comics.add(new Komik("Naruto", "Masashi Kishimoto"));
        comics.add(new Komik("One Piece", "Eiichiro Oda"));
        comics.add(new Komik("Bleach", "Tite Kubo"));
        comics.add(new Komik("My Hero Academia", "Kohei Horikoshi"));
        comics.add(new Komik("Attack on Titan", "Hajime Isayama"));


        for (Komik komik : comics) {
            System.out.println("Komik berjudul " + komik.judul + " dibuat oleh " + komik.pengarang + ".");
        }
    } 
}
