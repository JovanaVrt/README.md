# TEST RESULTS

##  Testiranje kalkulatora (Black Box)

###  Ispravni slučajevi

* 2+2 → 4
* 5*3 → 15
* 10/2 → 5
* 4+5*3 → 19 (poštuje prioritet operacija)

---

###  Uočeni problemi

* "" (prazan unos) → program puca (exception)
* 5/0 → vraća Infinity (nije obrađena greška)
* abc → vraća ERROR (nije jasno korisniku šta je problem)
* 2++2 → vraća ERROR
* +5 → radi samo zbog dodatne logike (nije idealno rešenje)
* 5* → ERROR (nema validacije izraza)

---

###  Problemi sa unosom

* nema validacije korisničkog inputa
* dozvoljeni su neispravni izrazi
* loše rukovanje greškama

---

##  Zaključak

Kalkulator radi za osnovne izraze, ali nije robustan. Postoji više problema sa validacijom unosa i obradom grešaka. Potrebno je unaprediti proveru izraza i handling izuzetaka.
