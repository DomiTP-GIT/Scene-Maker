@file:JvmName("Rectangle")

package com.ieseljust.kscenemaker

import java.awt.Color
import java.awt.Graphics

class Linia : Figura {

  // Inicialitzem les variables en la delcaració mateix
  // No utilitzarem cap constructor primari
  var x2: Int = 100
  var y2: Int = 100

  // Constructors secundaris
  constructor() : super() //Sense arguments

  constructor(x: Int, y: Int, x2: Int = 100, y2: Int = 100, color: Color = Color.BLACK) : super(x, y, color) {
    //super(x, y, color)
    this.x2 = x2
    this.y2 = y2

  }

  override fun describeMe() {
    /*
    * Mètode que mostra en mode text una descripció de la figura per la consola.
    * S'utilitzarà per al mètode llista de la CLI.
    */
    println("linia " + x + " " + y + " " + x2 + " " + y2 + " " + color)
  }

  override fun render(g: Graphics) {

    /*
     * Mètode que dibuixa sobre un context gràfic la figura rectangle.
     * S'utilitza per al mètode render() de App.
     *
     * Per dibuixar altres primitives de la classe Graphics, podeu consultar
     * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
     *
     * Fixeu-vos que això són classes de java que estem utilitzant
     * directament des de Kotlin!
     *
     */

    g.setColor(color)             // Establim el color interior
    g.drawLine(x, y, x2, y2)    // Dibuixem un rectangle en la posició i mida indicades
  }

}

