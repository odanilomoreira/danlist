package danilomoreira.danlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        private Button btn_adicionar;
        private Text txt_tarefa;
        private Spinner sp_categoria;

        btn_adicionar = findViewById(R.id.btn_adicionar);
        txt_tarefa = findViewById(R.id.txt_tarefa);
        sp_categoria = findViewById(R.id.sp_categoria);

        ArrayAdapter.createFromResource(this,R.array.Categoria,R.layout.support_simple_spinner_dropdown_item);
        sp_categoria.setAdapter(Adapter);

        btn_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //implementação do metodo
            }
        });

    }
}
