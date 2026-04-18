
}# Statička analiza projekta – Java Calculator

## 📊 LOC (Lines of Code)

Calculator.java – ~170 linija
Start.java – ~30 linija

---

        ## 🔍 Statička analiza

### Calculator.java

* ~170 linija – klasa ima previše odgovornosti (parsiranje izraza, validacija i računanje rezultata)
* ~170 linija – metoda `Calculate` je predugačka i kompleksna (veliki broj if uslova i rekurzija)
* ~170 linija – prisutan dupliran kod u obradi operacija (+, -, *, /)
* ~170 linija – koristi se globalna promenljiva `finalResult` (loša praksa)
        * ~170 linija – loš dizajn zbog statičkih metoda
* ~170 linija – nedostaju komentari i dokumentacija
* ~170 linija – metoda `ToString` nije u skladu sa Java konvencijama
* ~170 linija – potencijalni bug: `expression.charAt(0)` bez provere praznog stringa
* ~170 linija – hvatanje generičkog `Exception` bez adekvatne obrade
* ~170 linija – korišćenje String tipa za operacije umesto boljih struktura (npr. enum)
* ~170 linija – rekurzivni pristup povećava kompleksnost i otežava razumevanje

---

        ### Start.java

* ~30 linija – Scanner se kreira u svakoj iteraciji petlje (neefikasno upravljanje resursima)
* ~30 linija – potencijalno curenje resursa (Scanner se zatvara samo u jednom slučaju)
* ~30 linija – nepotrebna promenljiva `active`
        * ~30 linija – nedostatak validacije korisničkog unosa
* ~30 linija – nedostaju komentari i dokumentacija

---

        ## ⚠️ Uočeni problemi

* Dupliran kod
* Loša podela odgovornosti
* Slaba čitljivost koda
* Nedostatak dokumentacije
* Neefikasno upravljanje resursima
* Potencijalne runtime greške

---

        ## 🧠 Zaključak

Projekat implementira osnovnu funkcionalnost kalkulatora, ali sadrži više problema u dizajnu i organizaciji. Klasa Calculator ima previše odgovornosti i nije dovoljno modularna, dok Start klasa ima probleme sa upravljanjem resursima.

Preporučuje se refaktorisanje koda kroz:

        * razdvajanje odgovornosti na više klasa
* eliminaciju dupliranog koda
* poboljšanje čitljivosti i strukture
* pravilno upravljanje resursima

---

        ## 📄 Licenca

Projekat koristi MIT licencu, koja omogućava slobodno korišćenje, modifikaciju i distribuciju koda uz zadržavanje originalne licence i autora.
