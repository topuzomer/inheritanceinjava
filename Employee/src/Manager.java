public class Manager {
    public class Yonetici extends Employee { // Subclass

        private int sorumlu_kisi; // Ekstra Özellik

        public Yonetici(String name,String employeeNumber,String department,int age,int salary,int sorumlu_kisi) {

            super(name,employeeNumber,department,age,salary);

            this.sorumlu_kisi = sorumlu_kisi;

        }
        public void zam_yap(int zam_miktarı) {

            System.out.println("Çalışanlara " + zam_miktarı + " tl zam yapıldı");
        }
        public void showInfo() {

        /*System.out.println("İsim :" + getIsim());
        System.out.println("Maaş :" + getMaas());
        System.out.println("Departman :" + getDepartman());*/
            super.showInfo();


            System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);

        }

    }

}
