package com.dorogan.android.dorogan.feature_node.domain.use_case

import com.dorogan.android.dorogan.feature_node.domain.model.Note
import com.dorogan.android.dorogan.feature_node.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}