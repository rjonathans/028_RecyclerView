package br.com.digitalhouse.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.digitalhouse.recyclerview.R;
import br.com.digitalhouse.recyclerview.model.Contatos;

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ViewHolder> {

    private List<Contatos> listaContatos;

    public ContatoAdapter(List<Contatos> listaContatos){
        this.listaContatos = listaContatos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_lista_item_contato,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int posicao) {
        Contatos contato = listaContatos.get(posicao);
        viewHolder.onBind(contato);
    }

    @Override
    public int getItemCount() {
        return listaContatos.size();
    }

    //CLASSE VIEWHOLDER
    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNome;
        private TextView txtTelefone;
        private TextView txtStatus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtNome = itemView.findViewById(R.id.txtNome);
            txtTelefone = itemView.findViewById(R.id.txtTel);
            txtStatus = itemView.findViewById(R.id.txtStattus);
        }


        public void onBind(Contatos contato) {
            txtNome.setText(contato.getNome());
            txtTelefone.setText(contato.getTelefone());
            txtStatus.setText(contato.getStatus());
        }
    }
}