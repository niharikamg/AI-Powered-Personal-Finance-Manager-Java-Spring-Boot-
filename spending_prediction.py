import pandas as pd
from sklearn.ensemble import RandomForestRegressor
import joblib

# Dummy dataset
data = {
    'month': [1, 2, 3, 4, 5, 6],
    'spending': [500, 520, 530, 550, 570, 600]
}

df = pd.DataFrame(data)

# Prepare features and labels
X = df[['month']]
y = df['spending']

# Train model
model = RandomForestRegressor()
model.fit(X, y)

# Save model
joblib.dump(model, "spending_model.pkl")
