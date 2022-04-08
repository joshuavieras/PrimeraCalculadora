package cr.ac.primeracalculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {
    var operacion: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //println(expression.calculate())
        val buttonC: Button = findViewById(R.id.buttonC)
        buttonC.setOnClickListener { buttonCClick() }

        val buttonMas: Button = findViewById(R.id.buttonMas)
        buttonMas.setOnClickListener { buttonMasClick() }

        val buttonPorcentaje: Button = findViewById(R.id.buttonPorcentaje)
        buttonPorcentaje.setOnClickListener { buttonPorcentajeClick() }

        val buttonDel: Button = findViewById(R.id.buttonDel)
        buttonDel.setOnClickListener { buttonDelClick() }

        val buttonComa: Button = findViewById(R.id.buttonComa)
        buttonComa.setOnClickListener { buttonComaClick() }
        // 	Modulo function #

        val buttonMenos: Button = findViewById(R.id.buttonMenos)
        buttonMenos.setOnClickListener { buttonMenosClick() }

        val buttonDivide: Button = findViewById(R.id.buttonDivide)
        buttonDivide.setOnClickListener { buttonDivideClick() }

        val buttonPor: Button = findViewById(R.id.buttonPor)
        buttonPor.setOnClickListener { buttonPorClick() }

        val buttonIgual: Button = findViewById(R.id.buttonIgual)
        buttonIgual.setOnClickListener { buttonIgualClick() }

        val buttonOne: Button = findViewById(R.id.buttonOne)
        buttonOne.setOnClickListener { buttonOneClick() }

        val buttonTwo: Button = findViewById(R.id.buttonTwo)
        buttonTwo.setOnClickListener { buttonTwoClick() }

        val buttonThree: Button = findViewById(R.id.buttonThree)
        buttonThree.setOnClickListener { buttonThreeClick() }

        val buttonFour: Button = findViewById(R.id.buttonFour)
        buttonFour.setOnClickListener { buttonFourClick() }

        val buttonFive: Button = findViewById(R.id.buttonFive)
        buttonFive.setOnClickListener { buttonFiveClick() }

        val buttonSix: Button = findViewById(R.id.buttonSix)
        buttonSix.setOnClickListener { buttonSixClick() }

        val buttonSeven: Button = findViewById(R.id.buttonSeven)
        buttonSeven.setOnClickListener { buttonSevenClick() }

        val buttonEight: Button = findViewById(R.id.buttonEight)
        buttonEight.setOnClickListener { buttonEightClick() }

        val buttonNine: Button = findViewById(R.id.buttonNine)
        buttonNine.setOnClickListener { buttonNineClick() }

        val buttonZero: Button = findViewById(R.id.buttonZero)
        buttonZero.setOnClickListener { buttonZeroClick() }

        val buttonParenI: Button = findViewById(R.id.buttonParenI)
        buttonParenI.setOnClickListener { buttonParenIClick() }

        val buttonParenD: Button = findViewById(R.id.buttonParenD)
        buttonParenD.setOnClickListener { buttonParenDClick() }
    }

    private fun buttonParenDClick() {
        operacion += ")"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonParenIClick() {
        operacion += "("
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }




    private fun buttonPorcentajeClick() {
        operacion += "#"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }


    private fun buttonIgualClick() {
        var textop: TextView = findViewById(R.id.textoPrincipal)
        //println(expression.calculate())
        //val expression= Expression("2+2")
        textop.setText(Expression(operacion).calculate().toString())
    }


    private fun buttonZeroClick() {
        operacion += "0"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonOneClick() {
        operacion += "1"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonTwoClick() {
        operacion += "2"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonThreeClick() {
        operacion += "3"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonFourClick() {
        operacion += "4"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonFiveClick() {
        operacion += "5"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonSixClick() {
        operacion += "6"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonSevenClick() {
        operacion += "7"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonEightClick() {
        operacion += "8"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonNineClick() {
        operacion += "9"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }


    private fun buttonPorClick() {
        operacion += "*"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }


    private fun buttonDivideClick() {
        operacion += "/"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }


    private fun buttonMenosClick() {
        operacion += "-"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }


    private fun buttonMasClick() {
        operacion += "+"
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonComaClick() {
        operacion += "."
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonCClick() {
        operacion = ""
        var textop: TextView = findViewById(R.id.textoPrincipal)
        textop.setText(operacion)
    }

    private fun buttonDelClick() {
        if(operacion != ""){
            println(operacion.substring(0, operacion.length - 1))
            operacion=operacion.substring(0, operacion.length - 1)
            var textop: TextView = findViewById(R.id.textoPrincipal)
            textop.setText(operacion)
        }
    }

}