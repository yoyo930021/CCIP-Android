package org.coscup.ccip.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.coscup.ccip.R;
import org.coscup.ccip.model.Program;
import org.coscup.ccip.model.Type;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

public class ScheduleAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context mContext;
    private List<List<Program>> mProgramSlotList;
    private Map roomMap, typeMap;


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView startTimeText;
        private RecyclerView programView;

        public ViewHolder(View itemView) {
            super(itemView);
            startTimeText = (TextView) itemView.findViewById(R.id.start_time);
            programView = (RecyclerView) itemView.findViewById(R.id.programs);
        }
    }

    public ScheduleAdapter(Context context, List<List<Program>> programSlotList, Map<String, String> roomMap, Map<Integer, Type> typeMap) {
        mContext = context;
        mProgramSlotList = programSlotList;
        this.roomMap = roomMap;
        this.typeMap = typeMap;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_schedule, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
        final ViewHolder holder = ((ViewHolder) viewHolder);
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd HH:mm:ss");

        holder.programView.setLayoutManager(new LinearLayoutManager(mContext));
        holder.programView.setItemAnimator(new DefaultItemAnimator());

        final List<Program> programs = mProgramSlotList.get(position);
        holder.startTimeText.setText(programs.get(0).getStarttime());
        holder.programView.setAdapter(new ProgramAdapter(mContext, programs, roomMap, typeMap));
    }

    @Override
    public int getItemCount() {
        return mProgramSlotList.size();
    }
}
