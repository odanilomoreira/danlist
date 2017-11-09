package danilomoreira.danlist;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  /*
        Button btn_adicionar = (Button) findViewById(R.id.btn_adicionar);
        Text txt_tarefa = (Text) findViewById(R.id.txt_tarefa);

        Spinner sp_categoria = (Spinner) findViewById(R.id.sp_categoria);

        SpinnerAdapter Adaptador = new SpinnerAdapter() {
            @Override
            public View getDropDownView(int i, View view, ViewGroup viewGroup) {
                return null;
            }

            @Override
            public void registerDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public boolean hasStableIds() {
                return false;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                return null;
            }

            @Override
            public int getItemViewType(int i) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        };

        ArrayAdapter.createFromResource(this,R.array.Categoria,R.layout.support_simple_spinner_dropdown_item);
        sp_categoria.setAdapter(Adaptador);

        btn_adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //implementação do metodo
            }
        });
*/
    }
}
