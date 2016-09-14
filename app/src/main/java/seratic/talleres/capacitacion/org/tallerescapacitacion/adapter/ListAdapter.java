package seratic.talleres.capacitacion.org.tallerescapacitacion.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import seratic.talleres.capacitacion.org.tallerescapacitacion.R;
import seratic.talleres.capacitacion.org.tallerescapacitacion.model.PeliculasVO;

/**
 * Created by Personal on 13/09/2016.
 */
public class ListAdapter extends BaseAdapter {

    private Context context;
    private ListAdapter adapter;
    private List<PeliculasVO> peliculasVOList;

    public ListAdapter(Context context, List<PeliculasVO> peliculasVOs) {
        this.context=context;
        this.peliculasVOList=peliculasVOs;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if (v==null){
            v = View.inflate(context,R.layout.ly_list_view,null);

        }
        TextView txNombrePelicula= (TextView)v.findViewById(R.id.tx_nombre_pelicula);
        TextView  txSinopsis= (TextView)v.findViewById(R.id.tx_sinopsis);
        TextView  txFecha= (TextView)v.findViewById(R.id.tx_fecha);
       ImageView imvPoster = (ImageView) v.findViewById(R.id.imv_poster);
        txNombrePelicula.setText(peliculasVOList.get(position).getNombre());
        txSinopsis.setText(peliculasVOList.get(position).getSinopsis());
        txFecha.setText(peliculasVOList.get(position).getFecha());
        Picasso.with(context).load(peliculasVOList.get(position).getUrl()).into(imvPoster);
        if(position % 2 == 0){

            
            v.setBackgroundColor(v.getResources().getColor(R.color.colorVinoTinto));
        }else{
            v.setBackgroundColor(v.getResources().getColor(R.color.colorPrimary));
        }
        return v;
    }
}
