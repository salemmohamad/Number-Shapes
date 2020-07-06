package salem.com;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public void clicked (View v)
    {//get input and store it
        EditText inputNumber = findViewById(R.id.editText);
        int intNumber = Integer.parseInt(inputNumber.getText().toString());

        Double x=Math.sqrt(intNumber);

        //getting the triangular
        int triangularNumber=1;
        for(int i=2;triangularNumber<intNumber;i++)
        {

            triangularNumber = triangularNumber+i;

        }


        if(triangularNumber==intNumber) //Triangular=TRUE
        {
            if(Math.floor(x)==Math.ceil(x)) //if it's a whole number
            {
                Toast.makeText(MainActivity.this, "It's Triangular and Square!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "It's Triangular, But not Square!", Toast.LENGTH_SHORT).show();
            }
        }
        else //TRIANGULAR=FALSE
        {
            if(Math.floor(x)==Math.ceil(x))
            {
                Toast.makeText(MainActivity.this, "It's Square, But not Triangular!", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "It's not Square nor Triangular!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}



