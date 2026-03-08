# Lab 3 - S’entraîner à créer des boucles (for-in) avec Kotlin

## Description

Ce laboratoire montre comment utiliser les **boucles en Kotlin** pour afficher différents motifs (patterns) avec des caractères `*`.

Le programme utilise :

- des boucles `for`
- des **boucles imbriquées**
- des calculs simples pour déterminer le nombre :
  - d'espaces
  - d'étoiles

Ces techniques sont souvent utilisées pour comprendre la logique algorithmique et la manipulation de texte dans la console.

---

# Concepts utilisés

## Boucle for

La boucle `for` permet de répéter une instruction plusieurs fois.

Exemple :

```
for (i in 1..5)
```

Cela signifie que `i` prendra les valeurs de **1 à 5**.

---

## Boucles imbriquées

Une **boucle imbriquée** est une boucle placée à l'intérieur d'une autre boucle.

Exemple :

```
for (i in 1..5) {
    for (j in 1..i) {
        print("*")
    }
}
```

La première boucle contrôle les lignes et la seconde contrôle les caractères affichés.

---

# Pattern 1 – Triangle inversé

Ce motif affiche un triangle d'étoiles qui diminue à chaque ligne.

Exemple de sortie :

```
*****
 ****
  ***
   **
    *
```

Logique :

- le nombre d'espaces augmente
- le nombre d'étoiles diminue

---

# Pattern 2 – Triangle (montée et descente)

Ce motif crée une forme ressemblant à un **diamant incomplet**.

Sortie :

```
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
```

Logique :

1. Une première boucle pour la montée
2. Une seconde boucle pour la descente

---

# Pattern 3 – Triangle inversé centré

Ce motif affiche un triangle inversé centré.

Sortie :

```
*********
 *******
  *****
   ***
    *
```

Le nombre d'étoiles diminue de **2 à chaque ligne** pour garder la symétrie.

---

# Programme complet

```kotlin
fun main() {
    for (i in 1..5) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 6 - i
        for (j in 1..numberOfStars) {
            print("*")
        }

        println()
    }

    val height = 5

    for (i in 1..height) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    for (i in (height - 1) downTo 1) {
        val numberOfSpaces = height - i
        for (j in 1..numberOfSpaces) print(" ")

        val numberOfStars = i
        for (j in 1..numberOfStars) print("*")

        println()
    }

    for (i in 1..5) {

        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces) {
            print(" ")
        }

        val numberOfStars = 11 - i * 2
        for (j in 1..numberOfStars) {
            print("*")
        }

        println()
    }
}
```

---

# Objectifs pédagogiques

Après ce laboratoire, l’étudiant doit être capable de :

- utiliser les boucles `for`
- comprendre les boucles imbriquées
- manipuler des intervalles (`1..n`)
- utiliser `downTo`
- construire des motifs avec du texte

---

# Technologies

- Kotlin
- Application console
- Boucles et structures de contrôle

---

# Exemple 

<img width="856" height="406" alt="tabk3" src="https://github.com/user-attachments/assets/54aec3de-822d-4e12-b768-f13bdaedb919" />
