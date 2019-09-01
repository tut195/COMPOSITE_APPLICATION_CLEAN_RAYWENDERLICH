package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.DocumentRepository

class GetDocuments(private val documentRepository: DocumentRepository) {
        suspend operator fun invoke() = documentRepository.getDocuments()
//    suspend fun invoke() = documentRepository.getDocuments()
}

