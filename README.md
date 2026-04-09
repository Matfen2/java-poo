# 🧱 java-poo

Exercices progressifs sur la **Programmation Orientée Objet** en Java — classes, héritage, polymorphisme, interfaces et collections.

Suite du repo [java-basics](https://github.com/Matfen2/java-basics), réalisés dans le cadre de mon apprentissage de Java en parallèle de mon alternance Full-Stack (React / NestJS / TypeScript).

---

## 📚 Contenu

### 🔸 POO intermédiaire — classes, héritage, polymorphisme, abstraction

| # | Fichier(s) | Exercice | Concepts |
|---|------------|----------|----------|
| 12a | [Person.java](./Person.java) | Personne | Classe, constructeur, méthode `sePresenter()` |
| 12b | [Rectangle.java](./Rectangle.java) | Rectangle | `surface()`, `perimetre()`, `toString()` |
| 13 | [Vehicule.java](./testVehicule.java) · [Voiture.java](./Voiture.java) · [Moto.java](./Moto.java) · [testVehicule.java](./testVehicule.java) | Véhicules | Héritage (`extends`), `super`, `afficher()` |
| 14 | [Formes.java](./testFormes.java) · [Cercle.java](./Cercle.java) · [Rectangle.java](./Rectangle.java) · [Triangle.java](./Triangle.java) · [testFormes.java](./testFormes.java) | Formes géométriques | Classe abstraite, tableau polymorphe `Forme[]` |
| 15 | [Payment.java](./testPayment.java) · [CarteBancaire.java](./CarteBancaire.java) · [Cheque.java](./Cheque.java) · [Especes.java](./Especes.java) · [testPayment.java](./testPayment.java) | Paiements | Héritage, tableau mixte, `payer()` |
| 16 | [Animals.java](./testAnimals.java) · [Chien.java](./Chien.java) · [Aigle.java](./Aigle.java) · [Canard.java](./Canard.java) · [testAnimals.java](./testAnimals.java) | Système d'animaux | Interfaces multiples (`implements`), `instanceof`, cast |

---

## 💡 Concepts clés abordés

**Héritage** — `extends` permet à une classe enfant de réutiliser et spécialiser le comportement d'une classe parent.

**Polymorphisme** — un objet peut prendre plusieurs formes. Un `Canard` est à la fois `Animal`, `Marcheur`, `Nageur` et `Voleur`.

**Abstraction** — une classe ou méthode abstraite (`abstract`) impose aux classes enfants de définir le comportement.

**Interface** — contrat que les classes doivent respecter en implémentant les méthodes déclarées.

**Encapsulation** — les attributs sont `private`, accessibles uniquement via getters/setters.

```
public     → accessible partout
private    → accessible uniquement dans la classe
protected  → accessible dans la classe et ses sous-classes
default    → accessible dans le package uniquement
```

---

## 🛠 Stack

- **Langage** : Java 21
- **IDE** : VS Code
- **Build** : aucun (fichiers standalone, exécutables via `main`)

---

## 🚀 Lancer un exercice

```bash
# Compiler
javac testAnimals.java

# Exécuter
java testAnimals
```

---

## 👤 Auteur

**Mathieu Fenouil** — Développeur Full-Stack en alternance  
🔗 [GitHub](https://github.com/Matfen2) · [LinkedIn](https://www.linkedin.com/in/mathieu-fenouil)
