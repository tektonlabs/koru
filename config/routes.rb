Rails.application.routes.draw do

  mount RailsAdmin::Engine => '/admin', as: 'rails_admin'
  root 'refuges#index'

  namespace :api, defaults: { format: :json } do
    namespace :v1 do
      resources :refuges, only: :index do
        resources :entities, only: :index
        resources :responses, only: :create
      end
    end
  end

  resources :refuges, only: [:index, :show] do
    member do
      get :detail
      get :historical_issues_by_entity
    end
  end

end
