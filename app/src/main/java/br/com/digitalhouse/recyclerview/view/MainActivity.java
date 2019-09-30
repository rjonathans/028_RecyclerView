package br.com.digitalhouse.recyclerview.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.recyclerview.R;
import br.com.digitalhouse.recyclerview.adapter.ContatoAdapter;
import br.com.digitalhouse.recyclerview.model.Contatos;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ContatoAdapter adapter;
    private List<Contatos> listaContatos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaRecyclerView);
        adapter = new ContatoAdapter(retornaListaContato());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }

    private List<Contatos> retornaListaContato() {
        listaContatos.add(new Contatos("Robson","11 5921-4294","Confirmado"));
        listaContatos.add(new Contatos("João","11 3943-3409","Confirmado"));
        listaContatos.add(new Contatos("Jessica","11 3098-2039","Confirmado"));
        listaContatos.add(new Contatos("Ariel","11 94039-4039","Incompleto"));
        listaContatos.add(new Contatos("Andreza","11 5099-3203","Confirmado"));
        listaContatos.add(new Contatos("Jessica", "0000000000","Confirmado"));
        listaContatos.add(new Contatos("Joao", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Ariel", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Rafael", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Andreza", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Robson", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("William", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Victor", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Nina", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Deivid", "22222222222","Confirmado"));
        listaContatos.add(new Contatos("Luiz", "22222222222","Incompleto"));
        listaContatos.add(new Contatos("Josemar", "22222222222","Incompleto"));
        listaContatos.add(new Contatos("Cecilia", "22222222222","Incompleto"));
        listaContatos.add(new Contatos("Katheryne", "22222222222","Incompleto"));
        listaContatos.add(new Contatos("Camila", "22222222222","Confirmado"));

        return listaContatos;

    }

}