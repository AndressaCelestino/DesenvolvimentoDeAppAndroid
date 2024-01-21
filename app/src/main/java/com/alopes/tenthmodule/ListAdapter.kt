package com.alopes.tenthmodule

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alopes.tenthmodule.databinding.ItemBinding

class ListAdapter(
    val contacts: MutableList<ContactInfo>,
    val listener: ListAdapterListener
): RecyclerView.Adapter<ListAdapter.ListItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(ItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ))
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {

        val item = contacts[position]
        val concat = " Nome: " + item.name + " Telefone: "+ item.phone
        holder.contactName.text = item.name
        holder.contactPhone.text = item.phone

        holder.root.setOnClickListener {
            listener.onItemClicked(concat)
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

    class ListItemViewHolder(binding:ItemBinding) : RecyclerView.ViewHolder(binding.root){
        var root = binding.root
        var contactName = binding.contactName
        var contactPhone = binding.contactPhone

    }
    interface ListAdapterListener{
        fun onItemClicked(content: String);
    }
}