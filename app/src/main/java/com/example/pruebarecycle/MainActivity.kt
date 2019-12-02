package com.example.pruebarecycle

import android.app.Activity
import android.os.Bundle

import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1º) Quiero mostrar un conjunto de objetos. (P.Ej: ArrayList<Student>)
        val students: ArrayList<Student> = ArrayList<Student>()
        students.add(Student("Samuel", "Marrero"))
        students.add(Student("Francis", "Sosa"))
        students.add(Student("Gustavo", "Vega"))
        students.add(Student("Juan", "Sosa"))
        students.add(Student("Jacinto", "Ramos Moreno"))
        students.add(Student("Javier", "Santana"))
        students.add(Student("Olga", "Cruz"))
        //2º) Uso un RecyclerView para mostrar un conjunto de items en general.
        val recyclerViewStudents: RecyclerView = findViewById(R.id.recyclerViewStudents)
        //3º) Indico la disposición en la que se mostrarán los items en el RecyclerView (P.Ej: GridLayout de 2 columnas)
        val layoutManagerStudents: RecyclerView.LayoutManager = GridLayoutManager(this, 1)
        recyclerViewStudents.setLayoutManager(layoutManagerStudents)
        //4º) Asigno al RecyclerView el adaptador que relaciona a cada item con su objeto a mostrar.
        val studentsAdapter = StudentsAdapter(students)
        recyclerViewStudents.setAdapter(studentsAdapter)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean { // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { // Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        return if (id == R.id.action_settings) {
            true
        } else super.onOptionsItemSelected(item)
    }
}

