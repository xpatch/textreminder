package info.pixelbunny.textreminder;

/**
 * Created by meggz on 23/12/14.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;
//import android.view.ViewGroup;


public class MessageFragment extends Fragment {


    public MessageFragment() {
        //constructor

    }

    //copied from other other code
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.fragment_main, container, false);

        Button submitButton =(Button) fragmentView.findViewById(R.id.buttonSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View fragmentView) {

                int phoneNumber;

                TextView textViewNumber = (TextView) fragmentView.findViewById(R.id.textViewNumber);
                TextView textViewMessage = (TextView) fragmentView.findViewById(R.id.textViewMessage);

                //set up error messaging!!!
                String strNumber = textViewNumber.getText().toString();
                if (strNumber != null && !strNumber.isEmpty()) {
                    //does this need to be an int?
                    try {
                        phoneNumber = Integer.parseInt(strNumber);
                    } catch (NumberFormatException e) {
                        //do something here?
                    }
                }




            }
        });

        return fragmentView;

    }


    public void BindSubmitMessage() {


    }



}
