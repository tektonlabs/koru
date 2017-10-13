/*

===========================================================================
Koru GPL Source Code
Copyright (C) 2017 Tekton Labs
This file is part of the Koru GPL Source Code.
Koru Source Code is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Koru Source Code is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Koru Source Code. If not, see <http://www.gnu.org/licenses/>.
===========================================================================

*/

package com.tektonlabs.android.refugeapp.data.usecase;

import com.tektonlabs.android.refugeapp.data.network.models.Questionnaire;
import com.tektonlabs.android.refugeapp.data.repositories.QuestionRepository;
import com.tektonlabs.android.refugeapp.data.repositories.callbacks.QuestionRepositoryCallback;
import com.tektonlabs.android.refugeapp.data.usecase.callbacks.QuestionAnswerUseCaseCallback;
import com.tektonlabs.android.refugeapp.presentation.questions.callbacks.AnsweredQuestionsDataResponse;

public class PostAnswers extends BaseUseCase implements QuestionAnswerUseCaseCallback {

    private AnsweredQuestionsDataResponse answeredQuestionsDataResponse;
    private QuestionRepositoryCallback questionRepositoryCallback;

    public PostAnswers(AnsweredQuestionsDataResponse answeredQuestionsDataResponse) {
        this.answeredQuestionsDataResponse = answeredQuestionsDataResponse;
        questionRepositoryCallback = new QuestionRepository(this);
    }

    public void postAnswers(int shelterId, Questionnaire questionnaire) {
        questionRepositoryCallback.postAnswers(shelterId, questionnaire);
    }


    public void postPendingAnswers() {
        questionRepositoryCallback.postPendingAnswers();
    }

    @Override
    public void onDataFailure(Object object) {
        answeredQuestionsDataResponse.onQuestionsAnsweredFailure(object);
    }


    @Override
    public void onQuestionsAnswersSuccess(String message, int shelterId) {
        answeredQuestionsDataResponse.onQuestionsAnsweredSuccess(message, shelterId);

    }
}