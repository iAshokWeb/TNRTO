package machan.com.tamilnadurtodirectory;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;


public class ListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        final ListView listView;
        listView=(ListView) findViewById(R.id.listview);

        String[] values = new String[] {
                "TN01 - Chennai(Central)",
                "TN02 - Chennai(North West)",
                "TN03 - Chennai(North East)",
                "TN04 - Chennai(East)",
                "TN05 - Chennai(North)",
                "TN06 - Chennai(South East)",
                "TN09 - Chennai(West)",
                "TN10 - Chennai(South West)",
                "TN11 - Thambaram",
                "TN11Z - Solinga Nalloor",
                "TN16 - Dhindivanam",
                "TN18 - Red Hills",
                "TN18Z - Ambathur",
                "TN19 - Sengalpattu",
                "TN19Z - Madhurandhagam",
                "TN20 - Thiruvalloor",
                "TN20Y - Poona Malli",
                "TN21 - Kaanji Puram",
                "TN21W - Sri PerumPudhoor",
                "TN22 - MeenamPakkam",
                "TN23 - Veloor",
                "TN23T - Kudiyaaththam",
                "TN23Y - VaaniyamPaadi",
                "TN24 - Krishnakiri",
                "TN25 - Thiruvannamalai",
                "TN25Z - Aarani",
                "TN28 - Naamakkal",
                "TN28Y - Paramaadhi Velloor",
                "TN28Z - Raasipuram",
                "TN29 - Dharmapuri",
                "TN29W - Paalakodu",
                "TN29Z - Karoor",
                "TN30 - Salem",
                "TN30W - Omaloor",
                "TN31 - Kadaloor",
                "TN31U - Sithamparam",
                "TN31V - Viruthaachalam",
                "TN31Y - Neiveli",
                "TN32- Vizhuppuram",
                "TN32W - Kallakkurichi",
                "TN32Z - Ulundhoorpet",
                "TN33 - Erode",
                "TN34 - Thiruchengodeu",
                "TN36 - Gopychetti Paalayam",
                "TN36W - Bavani",
                "TN36Z - Saththiya Mangalam",
                "TN37 - Coimbatore(South)",
                "TN38 - Coimbatore(North)",
                "TN39 - Thiruppoor",
                "TN39Z - Avinaasi",
                "TN40 - Mettuppalayam",
                "TN41 - Pollachi",
                "TN42 - Thiruppoor(South)",
                "TN42Y - Kangayam",
                "TN43 - Ooty",
                "TN43Z - Koodaloor",
                "TN45 - Thiruchirappalli",
                "TN45Y - Thiruverumboor",
                "TN45Z - Manapaarai",
                "TN46 - Perambaloor",
                "TN47 - Karoor",
                "TN47Z - Kulithalai",
                "TN48 - Sri Rangam",
                "TN48Z - Thuraiyur",
                "TN49 - Thanjavoor",
                "TN49Y - Pattukottai",
                "TN50 - Thiruvaaroor",
                "TN50Z - Mannaarkudi",
                "TN51 - Naagapattinam",
                "TN51Z - Mayiladhurai",
                "TN52Z - Mettoor",
                "TN54 - Salem(East)",
                "TN55 - Pudhukkottai",
                "TN55Z - Arandhaangi",
                "TN56 - Perundhurai",
                "TN57 - Dhindukkal",
                "TN57R - Ottanchathiram",
                "TN57V - Vadasandhoor",
                "TN57Y - Pattalagundu",
                "TN57Z - Pazhani",
                "TN58 - Madurai(South)",
                "TN58Z - Thirumangalam",
                "TN59 - Madurai(North)",
                "TN59V - Vaadipatti",
                "TN59Z - Meloor",
                "TN60 - Theni",
                "TN60Z - Uththamapalayam",
                "TN61 - Ariyaloor",
                "TN63 - Sivagangai",
                "TN63Z - Kaaraikudi",
                "TN64 - Madurai(South)",
                "TN65 - Ramanathapuram",
                "TN65Z - Paramakudi",
                "TN66 - Coimbatore(Central)",
                "TN67 - Virudhunagar",
                "TN67U - Sivakaasi",
                "TN67Z - Srivillipudhur",
                "TN68 - Kumbakonam",
                "TN69 - Thoothukudi",
                "TN69Y Thiruchendhoor",
                "TN69Z - Kovilpatti",
                "TN70 - Ossur",
                "TN72 - Thirunelveli",
                "TN72V - Valliyur",
                "TN73 - - Ranipet",
                "TN73Z - Arakkonam",
                "TN74 - Nagarkovil",
                "TN75 - Maarthandam",
                "TN76 - Thenkaasi",
                "TN76V - Ambaasamuthiram",
                "TN76Z - Sankarankovil",
                "TN77 - Aaththoor",
                "TN77Z - Vaazhapaadi",
                "TN78 - Thaarapuram",
                "TN78Z - Udumalapettai"


        };
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition     = position;

                // ListView Clicked item value
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "RTO & Area : " + itemValue, Toast.LENGTH_LONG)
                        .show();

            }

        });
        final EditText search;
        search=(EditText) findViewById(R.id.search);
        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String a=search.getText().toString().toLowerCase(Locale.getDefault());
                adapter.getFilter().filter(a);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.exit) {
            finish();
            return true;
        }
        if (id == R.id.more) {
            Intent intent=new Intent(getApplicationContext(),about.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
