package br.pro.aguiar.fdaep7.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import br.pro.aguiar.fdaep7.R
import br.pro.aguiar.fdaep7.model.Car
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.cars_recycler_view.view.*

class CarsRecyclerAdapter (
    private val cars: List<Car>,
    private val click : (Car) -> Unit
) : RecyclerView.Adapter<CarsRecyclerAdapter.CarsViewHolder>() {

    class CarsViewHolder(view: View)
        : RecyclerView.ViewHolder(view) {
        val carMarca : TextView = itemView.textViewCarMarca
        val carModelo : TextView = itemView.textViewCarModelo
        val carEdit : ImageButton = itemView.imageButtonCarEdit
        val carDel : ImageButton = itemView.imageButtonCarDel
    }

    override fun onCreateViewHolder
                (parent: ViewGroup, viewType: Int): CarsViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.cars_recycler_view,
                parent,
                false
            )
        val carsViewHolder = CarsViewHolder(view)

        carsViewHolder.itemView.setOnClickListener {
            // Poderia implementar aqui
            var car = cars[carsViewHolder.adapterPosition]
            click(car)
        }

        return carsViewHolder
    }

    override fun onBindViewHolder
                (holder: CarsViewHolder, position: Int) {
        val car = cars[position]
        holder.carMarca.text = car.marca
        holder.carModelo.text = car.modelo
        holder.carEdit.setOnClickListener {
            Snackbar.make(
                holder.carEdit,
                "Editar ${car.placa}",
                Snackbar.LENGTH_LONG
            ).show()
        }
        holder.carDel.setOnClickListener {
            Snackbar.make(
                holder.carEdit,
                "Excluir ${car.placa}",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }

    override fun getItemCount(): Int = cars.size
}