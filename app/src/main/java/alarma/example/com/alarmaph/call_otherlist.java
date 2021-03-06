package alarma.example.com.alarmaph;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by joshua on 2/25/2018.
 */

public class call_otherlist extends ArrayAdapter<String> {

private final Activity context;
private final ArrayList<String> oname;
private final ArrayList<Integer> imageId;
    TextView mcall;


public call_otherlist(Activity context,
                      ArrayList<String> oname, ArrayList<Integer> imageId) {
        super(context, R.layout.list_browse_others, oname);
        this.context = context;
        this.oname = oname;
        this.imageId = imageId;

        }


@Override
public View getView(final int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_browse_others, null, true);


        TextView txtAgency = (TextView) rowView.findViewById(R.id.a_agency);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.a_image);
        mcall = (TextView) rowView.findViewById(R.id.m_call);
        mcall.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Toast.makeText(context, "Call "+position, Toast.LENGTH_SHORT).show();
        }
        });


        txtAgency.setText(oname.get(position));
        imageView.setImageResource(imageId.get(position));
        return rowView;
        }
        }