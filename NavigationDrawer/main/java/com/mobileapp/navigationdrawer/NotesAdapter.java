//package com.mobileapp.navigationdrawer;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.NoteViewHolder> {
//
//    // List to hold notes data
//    private ArrayList<Notes> notesList;
//
//    // Constructor to initialize the adapter with notes data
//    public NotesAdapter(ArrayList<Notes> notesList) {
//        this.notesList = notesList;
//    }
//
//    // Method to create new view holders (invoked by the layout manager)
//    @NonNull
//    @Override
//    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false);
//        return new NoteViewHolder(view);
//    }
//
//    // Method to bind data to view holders (invoked by the layout manager)
//    @Override
//    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
//        Notes note = notesList.get(position);
//        holder.titleTextView.setText(note.getTitle());
//        holder.descriptionTextView.setText(note.getDescription());
//        holder.idText.setText(String.valueOf(note.getId()));
//    }
//
//    // Method to return the size of the notes list
//    @Override
//    public int getItemCount() {
//        return notesList.size();
//    }
//
//    // ViewHolder class to hold item views
//    public static class NoteViewHolder extends RecyclerView.ViewHolder {
//        TextView titleTextView;
//        TextView descriptionTextView;
//        TextView idText;
//
//        public NoteViewHolder(@NonNull View itemView) {
//            super(itemView);
//            titleTextView = itemView.findViewById(R.id.titleFor);
//            descriptionTextView = itemView.findViewById(R.id.desFor);
//            idText = itemView.findViewById(R.id.idFor);
//        }
//    }
//}
