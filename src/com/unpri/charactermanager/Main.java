package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CharacterManager manager = new CharacterManager();

        // 1. Tambah Karakter & Uji Duplikat
        System.out.println("=== 1. TEST TAMBAH & DUPLIKAT ===");
        manager.addCharacter(new Character("Arthur", CharacterType.WARRIOR));
        manager.addCharacter(new Character("Merlin", CharacterType.MAGE, 5, 100));
        manager.addCharacter(new Character("Lancelot", CharacterType.WARRIOR, 3, 50));
        
        // Coba masukkan nama duplikat "Arthur"
        manager.addCharacter(new Character("Arthur", CharacterType.ROGUE));

        // 2. Uji Mini-Challenge (Average Level & Find By Type)
        System.out.println("\n=== 2. TEST MINI-CHALLENGE ===" );
        System.out.println("Rata-rata Level: " + manager.getAverageLevel());
        
        // 3. Uji Fitur Analitik (Bagian C: findStrongestCharacter)
        System.out.println("\n=== 3. TEST FITUR ANALITIK (STRONGEST) ===");
        Character strongest = manager.findStrongestCharacter();
        if (strongest != null) {
            System.out.println("Karakter terkuat: " + strongest.getName() + " dengan Attack " + strongest.getAttack());
        }

        // 4. Uji Defensive Copy (Eksperimen Halaman 7)
        System.out.println("\n=== 4. TEST DEFENSIVE COPY ===");
        List<Character> list1 = manager.getAllCharacters();
        list1.clear(); // Mencoba menghapus list salinan
        System.out.println("Total karakter di manager setelah list salinan di-clear: " + manager.getTotalCharacters());
        // Hasil tetap sama karena yang dibersihkan adalah list baru, bukan list asli di manager.
    }
}