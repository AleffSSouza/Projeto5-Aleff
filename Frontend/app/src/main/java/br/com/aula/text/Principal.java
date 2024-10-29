package br.com.aula.text;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Principal extends AppCompatActivity {

    private Button btnCadastro;
    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);

        btnCadastro = findViewById(R.id.btnCadastro);

        btnCadastro.setOnClickListener(view -> {
            Intent intent = new Intent(Principal.this, TelaCadastro.class);
            startActivity(intent);
        });

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> {
            Intent intent = new Intent(Principal.this, TelaLogin.class);
            startActivity(intent);
        });







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}