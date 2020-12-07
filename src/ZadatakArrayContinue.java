/**
 * Imamo rečenicu??
 * <p>Trazim koliko se puta Adi nasmijao. Adi je zaista zabavan tip.
 * </p>
 * Imamo i rijec??
 * <p>Adi</p>
 * <p>ZADATAK : Napisati program koji provjerava koliko se rijec puta ponavlja u recenici</p>
 */
public class ZadatakArrayContinue {
    public static void main(String[] args) {
        String recenica = "Trazim koliko se puta Adi nasmijao. Adi je zaista zabavan tip.";
        String [] rijecURecenici = {"Trazim", "koliko", "se", "puta", "Adi", "nasmijao", "Adi", "je", "zaista", "zabavan", "tip"};
        String kljucnaRijec = "Adi";
        int brojac = 0;
        for (int i =0; i<rijecURecenici.length; i++) {
            if (rijecURecenici [i] != kljucnaRijec) {
                continue;
            }
            brojac++;
        }
        String poruka = String.format("Rijec '%s' u recenici '%s' se ponavlja '%d' puta.", kljucnaRijec,recenica, brojac);
        System.out.println(poruka);
    }
}