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

package com.tektonlabs.android.refugeapp.data.db.models.resolved;

import java.util.List;

import io.realm.RealmList;
import io.realm.RealmObject;

public class QuestionResolvedDb extends RealmObject {

    private Integer serverId;

    private String text;

    private RealmList<AnswerResolvedDb> answerDbs = null;

    private String questionType;

    private String min_value;

    private String max_value;

    private RealmList<QuestionResolvedDb> subQuestionDbs = null;

    private String answerValue = null;

    private Long questionnaireTime;

    public Long getQuestionnaireTime() {
        return questionnaireTime;
    }

    public void setQuestionnaireTime(Long questionnaireTime) {
        this.questionnaireTime = questionnaireTime;
    }

    public String getAnswerValue() {
        return answerValue;
    }

    public void setAnswerValue(String answerValue) {
        this.answerValue = answerValue;
    }

    public Integer getServerId() {
        return serverId;
    }

    public void setServerId(Integer serverId) {
        this.serverId = serverId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<AnswerResolvedDb> getAnswerDbs() {
        return answerDbs;
    }

    public void setAnswerDbs(RealmList<AnswerResolvedDb> answerDbs) {
        this.answerDbs = answerDbs;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public List<QuestionResolvedDb> getSubQuestionDbs() {
        return subQuestionDbs;
    }

    public void setSubQuestionDbs(RealmList<QuestionResolvedDb> subQuestionDbs) {
        this.subQuestionDbs = subQuestionDbs;
    }

    public String getMax_value() {
        return max_value;
    }

    public void setMax_value(String max_value) {
        this.max_value = max_value;
    }

    public String getMin_value() {
        return min_value;
    }

    public void setMin_value(String min_value) {
        this.min_value = min_value;
    }
}